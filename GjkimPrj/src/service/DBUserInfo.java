package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.conn.DBconn;

public class DBUserInfo {

	public List<Map<String, String>> getUserInfo() {

		// DB ��ȸ ����� �����ϱ� ���� List�� Map�� Ȱ���� ������ ����
		List<Map<String, String>> rList = null;

		try {
			
			// ����Ŭ �����ϱ�
			Connection conn = DBconn.getDBConnection();

			// ����Ŭ�� SQL ������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;

			// SQl ����
			String sql = "SELECT USER_ID, USER_NAME, EMAIL, ADDRESS, REG_DT FROM USER_INFO";

			// ����Ŭ�� ������ SQL ���� �����ϱ�
			pstmt = conn.prepareStatement(sql);

			// SQL ��ȸ ������ �����ϰ�, rs ������ ��� �����ϱ�
			// ResultSet ��ü�� Map �ڷ� ����(Ű�� ������ ����)�� ����Ŭ�� �����ϵ��� ������ �ڹ� ��ü
			// ResultSet ��ü�� DB�κ��� ��µǴ� ���ڵ��� ���� 2�� �̻��̸�, �ڵ����� List �迭�� Map ������ ������
			ResultSet rs = pstmt.executeQuery(sql);

			// ���̺� ��ȸ ����� �����ϱ� ���� ������ ������ �޸𸮿� �ø���
			rList = new ArrayList<Map<String, String>>();

			while (rs.next()) {
				
				System.out.println();

				// ���̺��� ���ڵ� �� �ٸ��� rMap ��ü�� ����
				Map<String, String> rMap = new HashMap<String, String>();

				String user_id = rs.getString("USER_ID");
				System.out.println("����� ���̵� : " + user_id);

				rMap.put("user_id", user_id);

				String user_name = rs.getString("USER_NAME");
				System.out.println("����� �̸� : " + user_name);

				rMap.put("user_name", user_name);

				String email = rs.getString("EMAIL");
				System.out.println("�̸��� : " + email);

				rMap.put("email", email);

				String address = rs.getString("ADDRESS");
				System.out.println("�ּ� : " + address);

				rMap.put("address", address);

				String reg_dt = rs.getString("REG_DT");
				System.out.println("ȸ�������� : " + reg_dt);

				rMap.put("reg_dt", reg_dt);

				rList.add(rMap);

				rMap = null; // ����� ������ �޸� ����
			}

			// ����Ŭ�κ��� ���� ���� ����� ����� ������ �ٷ� �޸𸮸� �����ؾ���
			// �������� ������ ����Ŭ DB�� ��� ������ �����ǰ� �־� DB�� ������ ������
			rs.close();

			// ����Ŭ DB ���� ����
			DBconn.DBClose(conn);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return rList;

	}

}

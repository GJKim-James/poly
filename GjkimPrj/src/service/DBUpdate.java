package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBconn;

public class DBUpdate {

	public void doUpdate(Map<String, String> pMap) {
		
		try {

			// ����Ŭ �����ϱ�
			Connection conn = DBconn.getDBConnection();

			// ����Ŭ�� SQL ������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;

			// SQL ����
			String sql = "UPDATE USER_INFO SET USER_ID=?, USER_NAME=?, EMAIL=?, ADDRESS=? WHERE USER_ID=?";

			// ����Ŭ�� ������ SQl ������ ����
			pstmt = conn.prepareStatement(sql);

			int idx = 0; // ? ������ �����ϱ� ���� ����

			// ���� �޴� pMap ��ü�� ���� SQL ������ ?�� �����ϱ�
			
			String user_id = pMap.get("user_id");
			System.out.println("���� ���� USER_ID : " + user_id);
			pstmt.setString(++idx, user_id); // ù��° ?
			
			String user_nm = pMap.get("user_nm");
			System.out.println("���� ���� USER_NAME : " + user_nm);
			pstmt.setString(++idx, user_nm); // �ι�° ?

			String email = pMap.get("email");
			System.out.println("���� ���� EMAIL : " + email);
			pstmt.setString(++idx, email); // ����° ?

			String addr = pMap.get("addr");
			System.out.println("���� ���� ADDRESS : " + addr);
			pstmt.setString(++idx, addr); // �׹�° ?
			
			String changed_id = pMap.get("changed_id");
			System.out.println("���� ���� USER_ID : " + changed_id);
			pstmt.setString(++idx, changed_id); // �ټ���° ?
			
			// insert ���� ����
			int res = pstmt.executeUpdate();

			if (res > 0) {
				System.out.println("������ ������Ʈ ����!");
			} else {
				System.out.println("������ ������Ʈ ����!");
			}

			pstmt = null;

			// ����Ŭ DB ���� ����
			DBconn.DBClose(conn);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

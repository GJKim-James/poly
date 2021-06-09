package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBconn;

public class DBdelete {

	public void doDelete(Map<String, String> pMap) {
		
		try {

			// ����Ŭ �����ϱ�
			Connection conn = DBconn.getDBConnection();

			// ����Ŭ�� SQL ������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;

			// SQL ����
			String sql = "DELETE FROM USER_INFO WHERE USER_ID=?";

			// ����Ŭ�� ������ SQl ������ ����
			pstmt = conn.prepareStatement(sql);

			int idx = 0; // ? ������ �����ϱ� ���� ����

			// ���� �޴� pMap ��ü�� ���� SQL ������ ?�� �����ϱ�
			
			String user_id = pMap.get("user_id");
			System.out.println("���� ���� USER_ID : " + user_id);
			pstmt.setString(++idx, user_id); // ù��° ?

			// insert ���� ����
			int res = pstmt.executeUpdate();

			if (res > 0) {
				System.out.println("������ ���� ����!");
			} else {
				System.out.println("������ ���� ����!");
			}

			pstmt = null;

			// ����Ŭ DB ���� ����
			DBconn.DBClose(conn);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

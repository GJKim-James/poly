package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.conn.DBconn;

public class DBSelect {

	public static void main(String[] args) throws SQLException {

		Connection conn = DBconn.getDBConnection(); // ����Ŭ �����ϱ�

		PreparedStatement pstmt = null; // ����Ŭ�� SQL ������ �����ϱ� ���� ��ü

		String sql = "select count(1) as CNT from USER_INFO"; // SQL ����

		pstmt = conn.prepareStatement(sql); // ����Ŭ�� ���޵� SQL ���� �����ϱ�

		ResultSet rs = pstmt.executeQuery(sql); // SQL ��ȸ ������ �����ϰ�, rs ������ ��� ����
												// ResultSet ��ü�� Map �ڷ� ����(Ű�� ������ ����)�� ����Ŭ�� �����ϵ��� ������ �ڹ� ��ü

		if (rs.next()) {
			String cnt = rs.getString("CNT");
			System.out.println("ȸ�������� �� CNT : " + cnt);
		}

		rs.close(); // ����Ŭ�κ��� ���޹��� ����� ����� ������ �ٷ� �޸𸮸� �����ؾ���
					// �������� ������ ����Ŭ DB�� ��� ������ �����ǰ� �־� DB�� ������ ������

		DBconn.DBClose(conn); // ����Ŭ DB ���� ����

	}

}

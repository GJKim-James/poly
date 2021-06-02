package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.conn.DBconn;

public class DBSelect {

	public static void main(String[] args) throws SQLException {

		Connection conn = DBconn.getDBConnection(); // 오라클 접속하기

		PreparedStatement pstmt = null; // 오라클에 SQL 쿼리를 전달하기 위한 객체

		String sql = "select count(1) as CNT from USER_INFO"; // SQL 선언

		pstmt = conn.prepareStatement(sql); // 오라클에 전달될 SQL 쿼리 저장하기

		ResultSet rs = pstmt.executeQuery(sql); // SQL 조회 쿼리를 실행하고, rs 변수에 결과 저장
												// ResultSet 객체는 Map 자료 구조(키와 값으로 구성)를 오라클에 적합하도록 구현한 자바 객체

		if (rs.next()) {
			String cnt = rs.getString("CNT");
			System.out.println("회원가입한 수 CNT : " + cnt);
		}

		rs.close(); // 오라클로부터 전달받은 결과는 사용이 끝나면 바로 메모리를 해제해야함
					// 해제하지 않으면 오라클 DB에 계속 연결이 유지되고 있어 DB의 성능이 떨어짐

		DBconn.DBClose(conn); // 오라클 DB 접속 종료

	}

}

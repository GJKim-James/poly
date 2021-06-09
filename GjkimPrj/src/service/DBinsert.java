package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBconn;

public class DBinsert {

	public void doInsert(Map<String, String> pMap) {

		try {

			// 오라클 접속하기
			Connection conn = DBconn.getDBConnection();

			// 오라클에 SQL 쿼리를 전달하기 위한 객체
			PreparedStatement pstmt = null;

			// SQL 선언
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NAME, EMAIL, ADDRESS) VALUES (";
			sql += "?, ";
			sql += "?, ";
			sql += "?, ";
			sql += "?) ";

			// 오라클에 전달할 SQl 쿼리를 저장
			pstmt = conn.prepareStatement(sql);

			int idx = 0; // ? 순번을 저장하기 위한 변수

			// 전달 받는 pMap 객체의 값과 SQL 쿼리의 ?와 대입하기
			
			String user_id = pMap.get("user_id");
			System.out.println("전달 받은 USER_ID : " + user_id);
			pstmt.setString(++idx, user_id); // 첫번째 ?

			String user_nm = pMap.get("user_nm");
			System.out.println("전달 받은 USER_NAME : " + user_nm);
			pstmt.setString(++idx, user_nm); // 두번째 ?

			String email = pMap.get("email");
			System.out.println("전달 받은 EMAIL : " + email);
			pstmt.setString(++idx, email); // 세번째 ?

			String addr = pMap.get("addr");
			System.out.println("전달 받은 ADDRESS : " + addr);
			pstmt.setString(++idx, addr); // 네번째 ?

			// insert 쿼리 실행
			int res = pstmt.executeUpdate();

			if (res > 0) {
				System.out.println("데이터 등록 성공!");
			} else {
				System.out.println("데이터 등록 실패!");
			}

			pstmt = null;

			// 오라클 DB 접속 종료
			DBconn.DBClose(conn);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

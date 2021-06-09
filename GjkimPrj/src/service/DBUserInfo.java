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

		// DB 조회 결과를 저장하기 위한 List와 Map을 활용한 데이터 구조
		List<Map<String, String>> rList = null;

		try {
			
			// 오라클 접속하기
			Connection conn = DBconn.getDBConnection();

			// 오라클에 SQL 쿼리를 전달하기 위한 객체
			PreparedStatement pstmt = null;

			// SQl 선언
			String sql = "SELECT USER_ID, USER_NAME, EMAIL, ADDRESS, REG_DT FROM USER_INFO";

			// 오라클에 전달할 SQL 쿼리 저장하기
			pstmt = conn.prepareStatement(sql);

			// SQL 조회 쿼리를 실행하고, rs 변수에 결과 저장하기
			// ResultSet 객체는 Map 자료 구조(키와 값으로 구성)를 오라클에 적합하도록 구현한 자바 객체
			// ResultSet 객체는 DB로부터 출력되는 레코드의 수가 2개 이상이면, 자동으로 List 배열에 Map 구조를 저장함
			ResultSet rs = pstmt.executeQuery(sql);

			// 테이블 조회 결과를 저장하기 위한 데이터 구조를 메모리에 올리기
			rList = new ArrayList<Map<String, String>>();

			while (rs.next()) {
				
				System.out.println();

				// 테이블의 레코드 한 줄마다 rMap 객체에 저장
				Map<String, String> rMap = new HashMap<String, String>();

				String user_id = rs.getString("USER_ID");
				System.out.println("사용자 아이디 : " + user_id);

				rMap.put("user_id", user_id);

				String user_name = rs.getString("USER_NAME");
				System.out.println("사용자 이름 : " + user_name);

				rMap.put("user_name", user_name);

				String email = rs.getString("EMAIL");
				System.out.println("이메일 : " + email);

				rMap.put("email", email);

				String address = rs.getString("ADDRESS");
				System.out.println("주소 : " + address);

				rMap.put("address", address);

				String reg_dt = rs.getString("REG_DT");
				System.out.println("회원가입일 : " + reg_dt);

				rMap.put("reg_dt", reg_dt);

				rList.add(rMap);

				rMap = null; // 사용이 끝나면 메모리 비우기
			}

			// 오라클로부터 전달 받은 결과는 사용이 끝나면 바로 메모리를 해제해야함
			// 해제하지 않으면 오라클 DB에 계속 연결이 유지되고 있어 DB의 성능이 떨어짐
			rs.close();

			// 오라클 DB 접속 종료
			DBconn.DBClose(conn);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return rList;

	}

}

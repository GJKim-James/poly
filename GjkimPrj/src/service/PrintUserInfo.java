package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintUserInfo {

	public static void main(String[] args) throws SQLException {
		
		// 입력 받는 값을 전달하기 위해 객체 생성
		Map<String, String> pMap = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");
		System.out.print("회원 아이디를 입력하세요 : ");
		pMap.put("user_id", sc.next());
		
		System.out.println("----------------------------------------------");
		System.out.print("회원 이름을 입력하세요 : ");
		pMap.put("user_nm", sc.next());
		
		System.out.println("----------------------------------------------");
		System.out.print("이메일을 입력하세요 : ");
		pMap.put("email", sc.next());
		
		System.out.println("----------------------------------------------");
		System.out.print("주소를 입력하세요 : ");
		pMap.put("addr", sc.next());
		
		sc.close(); // 사용이 끝나면 메모리 비우기
		
		DBinsert dbI = new DBinsert(); // DB 등록을 위한 객체를 메모리에 올림
		
		dbI.doInsert(pMap); // DB 등록하기 위한 함수 호출
		
		pMap = null; // 사용이 끝나면 메모리 비우기
		//--------------------------------------------------------------------------------------
		DBUserInfo ui = new DBUserInfo(); // 회원 정보를 가져오기 위해 DBUserInfo 객체를 메모리에 올림

		List<Map<String, String>> rList = ui.getUserInfo(); // 회원 정보 가져오기

		// rList = ui.getUserInfo(); 함수의 오류 발생 및 테이블 조회 결과가 없을 때
		// NullPointer 에러가 발생하는 것을 방지 하기 위해 강제로 메모리 올림
		if (rList == null) {
			rList = new ArrayList<Map<String, String>>();
		}

		System.out.println("----------------------------------------------");
		System.out.println("ui.getUserInfo() 함수로부터 전달받은 회원 정보를 출력합니다.");
		System.out.println("----------------------------------------------");

		Iterator<Map<String, String>> it = rList.iterator();

		while (it.hasNext()) {

			Map<String, String> rMap = it.next();

			// 예기치 않은 오류로 메모리에 존재하지 않는 경우를 대비하기 위해 강제로 메모리 올림
			if (rMap == null) {
				rMap = new HashMap<String, String>();
			}

			System.out.println("회원 아이디(user_id) : " + rMap.get("user_id"));
			System.out.println("회원 이름(user_name) : " + rMap.get("user_name"));
			System.out.println("이메일(email) : " + rMap.get("email"));
			System.out.println("주소(address) : " + rMap.get("address"));
			System.out.println("회원가입일(reg_dt) : " + rMap.get("reg_dt"));
			System.out.println("----------------------------------------------");

			rMap = null; // 사용이 끝나면 메모리 비우기
		}

		rList = null; // 사용이 끝나면 메모리 비우기

	}

}

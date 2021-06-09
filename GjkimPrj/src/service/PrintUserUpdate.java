package service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintUserUpdate {

	public static void main(String[] args) throws SQLException {

		Map<String, String> pMap = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");
		System.out.print("업데이트 할 아이디를 입력하세요 : ");
		pMap.put("changed_id", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("변경할 아이디를 입력하세요 : ");
		pMap.put("user_id", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("변경할 회원 이름을 입력하세요 : ");
		pMap.put("user_nm", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("변경할 이메일을 입력하세요 : ");
		pMap.put("email", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("변경할 주소를 입력하세요 : ");
		pMap.put("addr", sc.next());

		sc.close(); // 사용이 끝나면 메모리 비우기

		DBUpdate update = new DBUpdate(); // DB 등록을 위한 객체를 메모리에 올림

		update.doUpdate(pMap); // DB 등록하기 위한 함수 호출

		pMap = null; // 사용이 끝나면 메모리 비우기

	}

}

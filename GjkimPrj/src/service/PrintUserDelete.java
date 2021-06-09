package service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintUserDelete {

	public static void main(String[] args) throws SQLException {
		
		Map<String, String> pMap = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");
		System.out.print("삭제할 회원 아이디를 입력하세요 : ");
		pMap.put("user_id", sc.next());
		
		sc.close();
		
		DBdelete del = new DBdelete();
		
		del.doDelete(pMap);
		
		pMap = null;

	}

}

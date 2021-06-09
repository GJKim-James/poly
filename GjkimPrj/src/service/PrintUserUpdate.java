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
		System.out.print("������Ʈ �� ���̵� �Է��ϼ��� : ");
		pMap.put("changed_id", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("������ ���̵� �Է��ϼ��� : ");
		pMap.put("user_id", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("������ ȸ�� �̸��� �Է��ϼ��� : ");
		pMap.put("user_nm", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("������ �̸����� �Է��ϼ��� : ");
		pMap.put("email", sc.next());

		System.out.println("----------------------------------------------");
		System.out.print("������ �ּҸ� �Է��ϼ��� : ");
		pMap.put("addr", sc.next());

		sc.close(); // ����� ������ �޸� ����

		DBUpdate update = new DBUpdate(); // DB ����� ���� ��ü�� �޸𸮿� �ø�

		update.doUpdate(pMap); // DB ����ϱ� ���� �Լ� ȣ��

		pMap = null; // ����� ������ �޸� ����

	}

}

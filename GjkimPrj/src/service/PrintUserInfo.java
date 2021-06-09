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
		
		// �Է� �޴� ���� �����ϱ� ���� ��ü ����
		Map<String, String> pMap = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");
		System.out.print("ȸ�� ���̵� �Է��ϼ��� : ");
		pMap.put("user_id", sc.next());
		
		System.out.println("----------------------------------------------");
		System.out.print("ȸ�� �̸��� �Է��ϼ��� : ");
		pMap.put("user_nm", sc.next());
		
		System.out.println("----------------------------------------------");
		System.out.print("�̸����� �Է��ϼ��� : ");
		pMap.put("email", sc.next());
		
		System.out.println("----------------------------------------------");
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		pMap.put("addr", sc.next());
		
		sc.close(); // ����� ������ �޸� ����
		
		DBinsert dbI = new DBinsert(); // DB ����� ���� ��ü�� �޸𸮿� �ø�
		
		dbI.doInsert(pMap); // DB ����ϱ� ���� �Լ� ȣ��
		
		pMap = null; // ����� ������ �޸� ����
		//--------------------------------------------------------------------------------------
		DBUserInfo ui = new DBUserInfo(); // ȸ�� ������ �������� ���� DBUserInfo ��ü�� �޸𸮿� �ø�

		List<Map<String, String>> rList = ui.getUserInfo(); // ȸ�� ���� ��������

		// rList = ui.getUserInfo(); �Լ��� ���� �߻� �� ���̺� ��ȸ ����� ���� ��
		// NullPointer ������ �߻��ϴ� ���� ���� �ϱ� ���� ������ �޸� �ø�
		if (rList == null) {
			rList = new ArrayList<Map<String, String>>();
		}

		System.out.println("----------------------------------------------");
		System.out.println("ui.getUserInfo() �Լ��κ��� ���޹��� ȸ�� ������ ����մϴ�.");
		System.out.println("----------------------------------------------");

		Iterator<Map<String, String>> it = rList.iterator();

		while (it.hasNext()) {

			Map<String, String> rMap = it.next();

			// ����ġ ���� ������ �޸𸮿� �������� �ʴ� ��츦 ����ϱ� ���� ������ �޸� �ø�
			if (rMap == null) {
				rMap = new HashMap<String, String>();
			}

			System.out.println("ȸ�� ���̵�(user_id) : " + rMap.get("user_id"));
			System.out.println("ȸ�� �̸�(user_name) : " + rMap.get("user_name"));
			System.out.println("�̸���(email) : " + rMap.get("email"));
			System.out.println("�ּ�(address) : " + rMap.get("address"));
			System.out.println("ȸ��������(reg_dt) : " + rMap.get("reg_dt"));
			System.out.println("----------------------------------------------");

			rMap = null; // ����� ������ �޸� ����
		}

		rList = null; // ����� ������ �޸� ����

	}

}

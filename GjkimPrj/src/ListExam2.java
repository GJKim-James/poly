import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam2 {

	public static void main(String[] args) {

		List<String> rList = new ArrayList<>();

		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");

		System.out.println("List ũ�� : " + rList.size());

		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]��° �迭 ��� ���� : " + rList.get(i));
		}
		
		// List�� ����� �� Iterator�� �� ���� ����.
		Iterator<String> it = rList.iterator(); // while���� ����ϱ� ���� �ݺ��� ������ �˱� ���ؼ� Iterator�� ���(�ݺ��� ������ �� �� �ֵ��� ������ ���� ����)
		
		while (it.hasNext()) { // List �÷����� ���� ����� �����͸� ������ �� for���� ���� �ʰ�, while���� ���� ������
			String name = (String) it.next();

			System.out.println("�̸� : " + name);
		}

	}

}

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {

		List<String> rList = new ArrayList<>(); // List �������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�

		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿"); // List �÷��� �����ӿ�ũ�� 4���� �����͸� �߰���

		System.out.println("List ũ�� : " + rList.size()); // �迭�� ũ�� ���

		for (int i = 0; i < rList.size(); i++) { // size�� ���� ũ�⸦ �� �� �ֱ� ������ for�� ���
			System.out.println("[" + i + "]��° �迭 ��� ���� : " + rList.get(i));
		}

	}

}


public class Method { // new ����� Class ������ �ø�, static ����� Method, var(����) �ø�

	public static void main(String[] args) { // static Ű����� �޸𸮿� �÷ȱ� ������ ���� ����

		System.out.println("-----main �Լ� ����-----"); // ���� ���� �� �ľ��ϱ�
		
		int res = sum(4, 6);
		System.out.println("Res : " + res);
		
		System.out.println("-----main �Լ� ��-----");

	}

	public static int sum(int i1, int i2) { // static Ű����� �޸𸮿� �÷ȱ� ������ ���� ����

		System.out.println("---sum �Լ� ����---");

		int sum = 0;

		for (int i = i1; i <= i2; i++) {
			sum += i;
		}

		System.out.println("---sum �Լ� ��---");
		
		return sum;
	}

}

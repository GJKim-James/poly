
public class Quiz2 {

	public static void main(String[] args) {

		// 1���� 10���� ����ϴµ� 3�� ��� �տ� '[3�� ���]'�� ��µǵ��� �ڹ� �ڵ带 �ۼ��غ��ÿ�.

		int i;

		for (i = 1; i < 11; i++) {

			if (i % 3 == 0) {
				System.out.println("[3�� ���] " + i);

			} else {
				System.out.println(i);
			}
		}
		System.out.println();

		for (i = 1; i < 11; i++) {

			if (i % 3 == 0) {
				System.out.println("[3�� ���] "); // else�� ���� ���� ���
			}

			System.out.println(i);
		}
	}

}

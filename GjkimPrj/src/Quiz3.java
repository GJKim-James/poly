
public class Quiz3 {

	public static void main(String[] args) {

		// 1���� 100���� �߿��� 3�� �����(AND) 5�� ����� ���ڸ� ����Ͻÿ�.

		int i;

		for (i = 1; i <= 100; i++) {

			if (i % 15 == 0) {
//			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("[3�� 5�� ���] " + i);
			}
		}

	}

}

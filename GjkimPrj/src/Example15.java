
public class Example15 {

	public static void main(String[] args) {

		// for ���� if ���� ����Ͽ� 0~127�� �ƽ�Ű �ڵ��� 10����, 16����, ���ڸ� ����ϴ� ���α׷� �ۼ�

		int i;

		for (i = 0; i < 128; i++) {
			if (i % 16 == 0) {
				System.out.println("------------------");
				System.out.println("10����     16����     ����");
				System.out.println("------------------");
			}
			System.out.printf("%5d %5x %5c \n", i, i, i);
		}

	}

}


public class Midterm_Q5 {

	public static void main(String[] args) {
		
		// 4�� ����� ������ ���� �� 1���� 10���� �հ踦 ����ϴ� �ڹ� �ڵ带 �ۼ��Ͻÿ�.

		int i;
		int sum = 0;

		for (i = 1; i < 11; i++) {
			if (i % 4 != 0) {
				sum += i;
			}
		}
		System.out.println("��°�� : " + sum);

	}

}

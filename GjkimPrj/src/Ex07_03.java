import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = 0;
		int b = 0;

		while (true) {
			System.out.printf("ù ��° �Է� �� : ");
			a = s.nextInt();
			System.out.printf("�� ��° �Է� �� : ");
			b = s.nextInt();

			System.out.println("�հ� : " + (a + b));

			// �հ谡 10���� ũ�� ������
			if ((a+b) > 10) {
				break;
			}
		}

	}

}

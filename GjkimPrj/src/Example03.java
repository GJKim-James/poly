import java.io.IOException;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);

		int a;
		char k;
		int b;
		int result;

		System.out.print("ù ��° ����� ���� �Է��ϼ��� : ");
		a = s.nextInt();

		System.out.print("+ - * / % : ");
		k = (char) System.in.read();

		System.out.print("�� ��° ����� ���� �Է��ϼ��� : ");
		b = s.nextInt();

		if (k == '+') {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		}
		if (k == '-') {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		}
		if (k == '*') {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		}
		if (k == '/') {
			if (b != 0) {
				result = a / b;
				System.out.println(a + "/" + b + "=" + result);
			} else
				System.out.println("0���� ������ �ȵ˴ϴ�.");
		}
		if (k == '%') {
			if (b != 0) {
				result = a % b;
				System.out.println(a + "%" + b + "=" + result);
			} else
				System.out.println("0���� ������ ������ ���� ���� �� �����ϴ�.");
		}

	}

}

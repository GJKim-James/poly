import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a;
		int b;
		int c;
		int result;

		System.out.print("ù ��° ����� ���� �Է��ϼ��� : ");
		a = s.nextInt();

		System.out.print("<1>���� <2>���� <3>���� <4>������ : ");
		b = s.nextInt();

		System.out.print("�� ��° ����� ���� �Է��ϼ��� : ");
		c = s.nextInt();

		if (b == 1) {
			result = a + c;
			System.out.println(a + "+" + c + "=" + result);
		}
		if (b == 2) {
			result = a - c;
			System.out.println(a + "-" + c + "=" + result);
		}
		if (b == 3) {
			result = a * c;
			System.out.println(a + "x" + c + "=" + result);
		}
		if (b == 4) {
			result = a / c;
			System.out.println(a + "/" + c + "=" + result);
		}

	}

}

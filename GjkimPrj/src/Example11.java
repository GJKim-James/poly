import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a;
		char k;
		int b;

		System.out.printf("ù ��° ���� �Է��ϼ��� : ");
		a = s.nextInt();

		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		k = s.next().charAt(0);

		System.out.printf("�� ��° ���� �Է��ϼ��� : ");
		b = s.nextInt();

		if (k == '+')
			System.out.println(a + " + " + b + " = " + (a + b));

		if (k == '-')
			System.out.println(a + " - " + b + " = " + (a - b));
		
		if (k == '*')
			System.out.println(a + " * " + b + " = " + (a * b));
		
		if (k == '/')
			System.out.println(a + " / " + b + " = " + (a / (float) b));
		
		if (k == '%')
			System.out.println(a + " % " + b + " = " + (a % b));

	}

}

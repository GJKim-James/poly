import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a;
		char k;
		int b;

		System.out.printf("첫 번째 수를 입력하세요 : ");
		a = s.nextInt();

		System.out.printf("계산할 연산자를 입력하세요 : ");
		k = s.next().charAt(0);

		System.out.printf("두 번째 수를 입력하세요 : ");
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

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int k;
		int a = 0;
		String str;

		System.out.printf("�Է� ���� ���� <1>10���� <2>16���� <3>8���� : ");
		k = s.nextInt();

		System.out.printf("�� �Է� : ");

		if (k == 1) {
			str = s.next();
			a = Integer.parseInt(str, 10);
		}
		if (k == 2) {
			str = s.next();
			a = Integer.parseInt(str, 16);
		}
		if (k == 3) {
			str = s.next();
			a = Integer.parseInt(str, 8);
		}
		
		System.out.printf("10���� : %d \n", a);
		System.out.printf("16���� : %X \n", a);
		System.out.printf("8���� : %o \n", a);

	}

}

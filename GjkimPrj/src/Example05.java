import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int k;
		int a = 0;
		String str;

		System.out.printf("입력 진수 결정 <1>10진수 <2>16진수 <3>8진수 : ");
		k = s.nextInt();

		System.out.printf("값 입력 : ");

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
		
		System.out.printf("10진수 : %d \n", a);
		System.out.printf("16진수 : %X \n", a);
		System.out.printf("8진수 : %o \n", a);

	}

}

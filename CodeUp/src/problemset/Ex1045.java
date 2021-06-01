package problemset;

import java.util.Scanner;

public class Ex1045 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println((a + b));
		System.out.println((a - b));
		System.out.println((a * b));
		System.out.println((a / b));
		System.out.println((a % b));
		System.out.printf("%.2f", (float) a / (float) b);
		
	}

}

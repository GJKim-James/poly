package problemset;

import java.util.Scanner;

public class Ex1066 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		int b = s.nextInt();

		int c = s.nextInt();

		if (a % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");

		}
		// System.out.println((a % 2 == 0) ? "even" : "odd");

		if (b % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");

		}
		// System.out.println((b % 2 == 0) ? "even" : "odd");

		if (c % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");

		}
		// System.out.println((c % 2 == 0) ? "even" : "odd");

	}

}

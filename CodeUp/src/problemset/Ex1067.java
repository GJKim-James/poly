package problemset;

import java.util.Scanner;

public class Ex1067 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a > 0) {
			System.out.println("plus");

		} else {
			System.out.println("minus");

		}
		// System.out.println((a > 0) ? "plus" : "minus");
		
		if (a % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");

		}
		// System.out.println((a % 2 == 0) ? "even" : "odd");

	}

}

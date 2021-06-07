package problemset;

import java.util.Scanner;

public class Ex1051 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if (a <= b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}

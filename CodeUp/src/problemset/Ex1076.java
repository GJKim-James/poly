package problemset;

import java.util.Scanner;

public class Ex1076 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char c = sc.nextLine().charAt(0);

		for (int i = 'a'; i <= c; i++) {

			System.out.print((char) i + " ");

		}

	}

}

package problemset;

import java.util.Scanner;

public class Ex1068 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int score = s.nextInt();

		if (score >= 90) {
			System.out.println("A");

		} else if (score >= 70) {
			System.out.println("B");

		} else if (score >= 40) {
			System.out.println("C");

		} else {
			System.out.println("D");

		}

	}

}

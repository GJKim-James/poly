package problemset;

import java.util.Scanner;

public class Ex1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;

		int i = 0;

		for (i = 0; i <= n; i++) {
			sum = sum + i;

			if (sum >= n) {
				break;
			}
		}

		System.out.println(i);

	}

}

package problemset;

import java.util.Scanner;

public class Ex1082 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(16);

		for (int i = 1; i < 16; i++) {

			System.out.printf("%X*%X=%X\n", n, i, n * i);
			
		}

	}

}

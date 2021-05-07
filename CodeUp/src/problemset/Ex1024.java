package problemset;

import java.util.Scanner;

public class Ex1024 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String a[] = s.nextLine().split("");
		int i;

		for (i = 0; i < a.length; i++) {
			System.out.println("'" + a[i] + "'");
		}
	}

}

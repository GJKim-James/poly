package problemset;

import java.util.Scanner;

public class Ex1027 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String tmp[] = s.next().split("\\.");

		int y = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);
		int d = Integer.parseInt(tmp[2]);

		System.out.printf("%02d-%02d-%04d", d, m, y);

	}

}

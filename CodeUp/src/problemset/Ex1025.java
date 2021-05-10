package problemset;

import java.util.Scanner;

public class Ex1025 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		char a[] = str.toCharArray();
		
		System.out.println("[" + a[0] + "0000]");
		System.out.println("[" + a[1] + "000]");
		System.out.println("[" + a[2] + "00]");
		System.out.println("[" + a[3] + "0]");
		System.out.println("[" + a[4] + "]");

	}

}

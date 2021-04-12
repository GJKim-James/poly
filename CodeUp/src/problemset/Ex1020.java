package problemset;

import java.util.Scanner;

public class Ex1020 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] tmp = s.next().split("-");
		
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		
		System.out.printf("%06d%07d", a, b);

	}

}

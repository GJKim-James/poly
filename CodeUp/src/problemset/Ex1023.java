package problemset;

import java.util.Scanner;

public class Ex1023 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String tmp[] = s.next().split("\\.");
		
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		
		System.out.println(a);
		System.out.println(b);

	}

}

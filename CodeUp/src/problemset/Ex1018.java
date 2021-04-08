package problemset;

import java.util.Scanner;

public class Ex1018 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String tmp[] = s.next().split(":");
		
		int h = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);
		
		System.out.println(h + ":" + m);

	}

}

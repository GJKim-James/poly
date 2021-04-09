package problemset;

import java.util.Scanner;

public class Ex1019 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] tmp = s.next().split("\\.");
		int[] result = new int[tmp.length];
		
		for(int i=0; i<tmp.length; i++) {
			result[i] = Integer.parseInt(tmp[i]);
			
		}
		
		System.out.printf("%04d.%02d.%02d", result[0], result[1], result[2]);

	}

}

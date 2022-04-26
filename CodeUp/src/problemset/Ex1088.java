package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex1088 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0) {
				continue;
				
			} else {
				System.out.printf("%d ", i);
			}
		}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		for (int i = 1; i <= n; i++) {
//			
//			if (i % 3 != 0) {
//				
//				bw.write(i + " ");
//				
//			}
//			
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();

	}

}

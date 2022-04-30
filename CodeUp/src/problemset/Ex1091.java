package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1091 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] amdn = br.readLine().split(" ");

		int a = Integer.parseInt(amdn[0]);
		int m = Integer.parseInt(amdn[1]);
		int d = Integer.parseInt(amdn[2]);
		int n = Integer.parseInt(amdn[3]);
		
		long result = a;
		
		for (int i = 1; i < n; i++) {
			result = result * m + d;
		}
		
		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();

	}

}

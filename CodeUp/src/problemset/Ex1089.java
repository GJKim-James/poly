package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1089 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] adn = br.readLine().split(" ");
		
		int a = Integer.parseInt(adn[0]);
		int d = Integer.parseInt(adn[1]);
		int n = Integer.parseInt(adn[2]);
		
		int result = a + (n - 1) * d;
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();

	}

}

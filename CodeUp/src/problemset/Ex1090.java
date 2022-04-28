package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1090 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arn = br.readLine().split(" ");

		int a = Integer.parseInt(arn[0]);
		int r = Integer.parseInt(arn[1]);
		int n = Integer.parseInt(arn[2]);

		long result = (long) (a * Math.pow(r, n - 1));

		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();

	}

}

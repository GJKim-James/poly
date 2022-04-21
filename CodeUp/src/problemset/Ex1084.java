package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1084 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String rgb[] = br.readLine().split(" ");

		int cnt = 0;

		for (int i = 0; i < Integer.valueOf(rgb[0]); i++) {
			for (int j = 0; j < Integer.valueOf(rgb[1]); j++) {
				for (int k = 0; k < Integer.valueOf(rgb[2]); k++) {

					bw.write(i + " " + j + " " + k + "\n");
					cnt++;

				}
			}
		}

		bw.write(String.valueOf(cnt));
		bw.flush();

	}

}

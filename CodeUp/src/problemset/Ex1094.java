package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1094 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 10
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int arr[] = new int[n];
		
		for (int i = n; i > 0; i--) {
			arr[i - 1] = Integer.parseInt(st.nextToken()); // 10 4 2 3 6 6 7 9 8 5
		}
		
		for (int i : arr) {
			bw.write(i + " "); // 5 8 9 7 6 6 3 2 4 10
		}

		bw.flush();
		bw.close();
		br.close();

	}

}

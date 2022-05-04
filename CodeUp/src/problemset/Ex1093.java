package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1093 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 10
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int arr[] = new int[23];
		
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken()); // 1 3 2 2 5 6 7 4 5 9
			arr[num - 1] += 1;
		}
		
		for (int i = 0; i <23; i++) {
			bw.write(arr[i] + " "); // 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		}

		bw.flush();
		bw.close();
		br.close();

	}

}

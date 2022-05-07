package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1095 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 10

		StringTokenizer st = new StringTokenizer(br.readLine());

		int arr[] = new int[n];

		int min = 24;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); // 10 4 2 3 6 6 7 9 8 5
			min = Math.min(min, arr[i]); // Math.min(a, b)는 a와 b 중에 더 작은 값을 반환하는 함수이다. 
		}

		bw.write(String.valueOf(min)); // 2

		bw.flush();
		bw.close();
		br.close();

	}

}

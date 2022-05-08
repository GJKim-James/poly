package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1096 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 5

		int arr[][] = new int[19][19];

		for (int i = 0; i < n; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine()); // 1 1
//																		2 2
//																		3 3
//																		4 4
//																		5 5

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			arr[x - 1][y - 1] = 1;

		}

		for (int i = 0; i < 19; i++) {

			for (int j = 0; j < 19; j++) {

				bw.write(arr[i][j] + " ");

			}

			bw.write("\n");

		}

		bw.flush();
		bw.close();
		br.close();

	}

}

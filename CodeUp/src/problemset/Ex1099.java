package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1099 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[][] = new int[10][10];

		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int x = 1;
		int y = 1;

		while (true) {
			if (arr[x][y] == 0) {
				arr[x][y] = 9;
				y++;
			}
			
			if (arr[x][y] == 1) {
				y--;
				x++;
			}
			
			if (arr[x][y] == 2) {
				arr[x][y] = 9;
				break;
				
			} else if (arr[x][y + 1] == 1 && arr[x + 1][y] == 1) {
				if (arr[x][y] == 0) {
					arr[x][y] = 9;
				}
				break;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();

	}

}

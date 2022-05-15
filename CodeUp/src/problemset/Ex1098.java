package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1098 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] hw = br.readLine().split(" "); // 5 5(�������� ����, ����)
		int h = Integer.parseInt(hw[0]); // 5
		int w = Integer.parseInt(hw[1]); // 5
		int arr[][] = new int[h][w]; // 5�� 5���� ������ �迭 ����
		
		int n = Integer.parseInt(br.readLine()); // 3(������ ����)
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // 2 0 1 1, 3 1 2 3, 4 1 2 5
			int l = Integer.parseInt(st.nextToken()); // 2, 3, 4(���� ���� l)
			int d = Integer.parseInt(st.nextToken()); // 0, 1, 1(���� d; ���� 0, ���� 1)
			int x = Integer.parseInt(st.nextToken()) - 1; // 1, 2, 2(x��ǥ)
			int y = Integer.parseInt(st.nextToken()) - 1; // 1, 3, 5(y��ǥ)
			
			if (d == 0) { // ����
				for (int j = y; j < y + l; j++) {
					arr[x][j] = 1;
				}
				
			} else { // ����
				for (int j = x; j < x + l; j++) {
					arr[j][y] = 1;
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}

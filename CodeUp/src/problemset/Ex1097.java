package problemset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1097 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[][] = new int[19][19];

		for (int i = 0; i < 19; i++) { // 현재 바둑판 상황 입력 받기

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 19; j++) {

				arr[i][j] = Integer.parseInt(st.nextToken());

			}

		}

		int n = Integer.parseInt(br.readLine()); // 좌표 개수 입력 받기(뒤집을 횟수)

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken()); // 뒤집을 x좌표(가로) 저장

			int y = Integer.parseInt(st.nextToken()); // 뒤집을 y좌표(세로) 저장

			for (int j = 0; j < 19; j++) {
				// x좌표 고정에 y줄 뒤집기
				if (arr[x - 1][j] == 0) { // 기존이 검은돌이면
					arr[x - 1][j] = 1; // 흰돌로 뒤집기

				} else {
					arr[x - 1][j] = 0; // 흰돌이면 검은돌로 뒤집기
				}
				
				// y좌표 고정에 x줄 뒤집기
				if (arr[j][y - 1] == 0) { // 기존이 검은돌이면
					arr[j][y - 1] = 1; // 흰돌로 뒤집기

				} else {
					arr[j][y - 1] = 0; // 흰돌이면 검은돌로 뒤집기
				}

			}

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

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

		for (int i = 0; i < 19; i++) { // ���� �ٵ��� ��Ȳ �Է� �ޱ�

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 19; j++) {

				arr[i][j] = Integer.parseInt(st.nextToken());

			}

		}

		int n = Integer.parseInt(br.readLine()); // ��ǥ ���� �Է� �ޱ�(������ Ƚ��)

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken()); // ������ x��ǥ(����) ����

			int y = Integer.parseInt(st.nextToken()); // ������ y��ǥ(����) ����

			for (int j = 0; j < 19; j++) {
				// x��ǥ ������ y�� ������
				if (arr[x - 1][j] == 0) { // ������ �������̸�
					arr[x - 1][j] = 1; // �򵹷� ������

				} else {
					arr[x - 1][j] = 0; // ���̸� �������� ������
				}
				
				// y��ǥ ������ x�� ������
				if (arr[j][y - 1] == 0) { // ������ �������̸�
					arr[j][y - 1] = 1; // �򵹷� ������

				} else {
					arr[j][y - 1] = 0; // ���̸� �������� ������
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

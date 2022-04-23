package problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1085 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hbcs[] = br.readLine().split(" ");

		double h = Integer.parseInt(hbcs[0]); // 1�� ���� ����ũ�� �Ҹ������� üũ�ϴ� ��
		double b = Integer.parseInt(hbcs[1]); // �� �� üũ�� ����� �����ϴ� ��Ʈ
		double c = Integer.parseInt(hbcs[2]); // �¿� �� �Ҹ��� ������ Ʈ�� ������ ä��
		double s = Integer.parseInt(hbcs[3]); // ������ �ð�

		double multi = h * b * c * s; // �ʿ��� ���� ����(bit ����)
		
		double mb = multi / 8 / 1024 / 1024; // bit�� MB ������ ��ȯ(8bit = 1Byte, 1024Byte = 1KB, 1024KB = 1MB, 1024MB = 1GB, 1024GB = 1TB)
		
		System.out.printf("%.1f MB", mb);
		
		br.close();

	}

}

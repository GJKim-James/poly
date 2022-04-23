package problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String whb[] = br.readLine().split(" ");

		double w = Integer.parseInt(whb[0]); // �̹����� ���� �ػ�
		double h = Integer.parseInt(whb[1]); // ���� �ػ�
		double b = Integer.parseInt(whb[2]); // �� �ȼ��� �����ϱ� ���� ��Ʈ

		double multi = w * h * b; // �ʿ��� ���� �뷮(bit ����)
		
		double mb = multi / 8 / 1024 / 1024; // bit�� MB ������ ��ȯ(8bit = 1Byte, 1024Byte = 1KB, 1024KB = 1MB, 1024MB = 1GB, 1024GB = 1TB)
		
		System.out.printf("%.2f MB", mb); // �Ҽ��� ��° �ڸ����� �ݿø��Ͽ� ��° �ڸ����� ǥ��
		
		br.close();

	}

}

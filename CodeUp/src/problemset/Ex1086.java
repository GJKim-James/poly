package problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String whb[] = br.readLine().split(" ");

		double w = Integer.parseInt(whb[0]); // 이미지의 가로 해상도
		double h = Integer.parseInt(whb[1]); // 세로 해상도
		double b = Integer.parseInt(whb[2]); // 한 픽셀을 저장하기 위한 비트

		double multi = w * h * b; // 필요한 저장 용량(bit 단위)
		
		double mb = multi / 8 / 1024 / 1024; // bit를 MB 단위로 변환(8bit = 1Byte, 1024Byte = 1KB, 1024KB = 1MB, 1024MB = 1GB, 1024GB = 1TB)
		
		System.out.printf("%.2f MB", mb); // 소수점 셋째 자리에서 반올림하여 둘째 자리까지 표시
		
		br.close();

	}

}

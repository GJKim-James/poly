package problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1085 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hbcs[] = br.readLine().split(" ");

		double h = Integer.parseInt(hbcs[0]); // 1초 동안 마이크로 소리강약을 체크하는 수
		double b = Integer.parseInt(hbcs[1]); // 한 번 체크한 결과를 저장하는 비트
		double c = Integer.parseInt(hbcs[2]); // 좌우 등 소리를 저장할 트랙 개수인 채널
		double s = Integer.parseInt(hbcs[3]); // 녹음할 시간

		double multi = h * b * c * s; // 필요한 저장 공간(bit 단위)
		
		double mb = multi / 8 / 1024 / 1024; // bit를 MB 단위로 변환(8bit = 1Byte, 1024Byte = 1KB, 1024KB = 1MB, 1024MB = 1GB, 1024GB = 1TB)
		
		System.out.printf("%.1f MB", mb);
		
		br.close();

	}

}

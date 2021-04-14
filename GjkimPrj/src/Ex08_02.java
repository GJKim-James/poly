import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] aa = new int[4];
		int hap;

		System.out.println("입력받은 1번째 숫자를 aa배열에 저장합니다.");
		aa[0] = s.nextInt();

		System.out.println("입력받은 2번째 숫자를 aa배열에 저장합니다.");
		aa[1] = s.nextInt();

		System.out.println("입력받은 3번째 숫자를 aa배열에 저장합니다.");
		aa[2] = s.nextInt();

		System.out.println("입력받은 4번째 숫자를 aa배열에 저장합니다.");
		aa[3] = s.nextInt();

		hap = aa[0] + aa[1] + aa[2] + aa[3];
		System.out.println("합계 : " + hap);

		System.out.println();

		// 응용

		int[] bb = new int[4];
		int sum = 0;
		int i = 0;

		System.out.println("입력받은 1번째 숫자를 aa배열에 저장합니다.");
		bb[i++] = s.nextInt();

		System.out.println("입력받은 2번째 숫자를 aa배열에 저장합니다.");
		bb[i++] = s.nextInt();

		System.out.println("입력받은 3번째 숫자를 aa배열에 저장합니다.");
		bb[i++] = s.nextInt();

		System.out.println("입력받은 4번째 숫자를 aa배열에 저장합니다.");
		bb[i++] = s.nextInt();

		sum = bb[0] + bb[1] + bb[2] + bb[3];
		System.out.println("sum : " + sum);

		for (int j = 0; j < bb.length; j++) {
			System.out.println("bb[" + j + "] : " + bb[j]);

		}

	}

}
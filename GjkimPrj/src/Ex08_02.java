import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] aa = new int[4];
		int hap;

		System.out.println("�Է¹��� 1��° ���ڸ� aa�迭�� �����մϴ�.");
		aa[0] = s.nextInt();

		System.out.println("�Է¹��� 2��° ���ڸ� aa�迭�� �����մϴ�.");
		aa[1] = s.nextInt();

		System.out.println("�Է¹��� 3��° ���ڸ� aa�迭�� �����մϴ�.");
		aa[2] = s.nextInt();

		System.out.println("�Է¹��� 4��° ���ڸ� aa�迭�� �����մϴ�.");
		aa[3] = s.nextInt();

		hap = aa[0] + aa[1] + aa[2] + aa[3];
		System.out.println("�հ� : " + hap);

		System.out.println();

		// ����

		int[] bb = new int[4];
		int sum = 0;
		int i = 0;

		System.out.println("�Է¹��� 1��° ���ڸ� aa�迭�� �����մϴ�.");
		bb[i++] = s.nextInt();

		System.out.println("�Է¹��� 2��° ���ڸ� aa�迭�� �����մϴ�.");
		bb[i++] = s.nextInt();

		System.out.println("�Է¹��� 3��° ���ڸ� aa�迭�� �����մϴ�.");
		bb[i++] = s.nextInt();

		System.out.println("�Է¹��� 4��° ���ڸ� aa�迭�� �����մϴ�.");
		bb[i++] = s.nextInt();

		sum = bb[0] + bb[1] + bb[2] + bb[3];
		System.out.println("sum : " + sum);

		for (int j = 0; j < bb.length; j++) {
			System.out.println("bb[" + j + "] : " + bb[j]);

		}

	}

}
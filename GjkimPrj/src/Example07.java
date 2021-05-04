import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str;
		int i;

		System.out.printf("문자열을 입력하세요 : ");
		str = s.nextLine();

		for (i = str.length() - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}

	}

}


public class Example15 {

	public static void main(String[] args) {

		// for 문과 if 문을 사용하여 0~127번 아스키 코드의 10진수, 16진수, 문자를 출력하는 프로그램 작성

		int i;

		for (i = 0; i < 128; i++) {
			if (i % 16 == 0) {
				System.out.println("------------------");
				System.out.println("10진수     16진수     문자");
				System.out.println("------------------");
			}
			System.out.printf("%5d %5x %5c \n", i, i, i);
		}

	}

}

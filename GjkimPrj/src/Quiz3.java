
public class Quiz3 {

	public static void main(String[] args) {

		// 1부터 100까지 중에서 3의 배수와(AND) 5의 배수인 숫자만 출력하시오.

		int i;

		for (i = 1; i <= 100; i++) {

			if (i % 15 == 0) {
//			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("[3과 5의 배수] " + i);
			}
		}

	}

}

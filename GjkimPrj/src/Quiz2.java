
public class Quiz2 {

	public static void main(String[] args) {

		// 1부터 10까지 출력하는데 3의 배수 앞에 '[3의 배수]'가 출력되도록 자바 코드를 작성해보시오.

		int i;

		for (i = 1; i < 11; i++) {

			if (i % 3 == 0) {
				System.out.println("[3의 배수] " + i);

			} else {
				System.out.println(i);
			}
		}
		System.out.println();

		for (i = 1; i < 11; i++) {

			if (i % 3 == 0) {
				System.out.println("[3의 배수] "); // else를 쓰지 않을 경우
			}

			System.out.println(i);
		}
	}

}

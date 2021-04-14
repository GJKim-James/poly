
public class Quiz4 {

	public static void main(String[] args) {

		// for 문을 이용하여 3단부터 8단까지 출력하시오.

		int i;
		int k;

		for (i = 3; i < 9; i++) {
			for (k = 1; k < 10; k++) {
				System.out.println(i + "x" + k + "=" + (i * k));
			}
			System.out.println();
		}

	}

}


public class Midterm_Q4 {

	public static void main(String[] args) {
		
		// 반복문(for)을 사용하여 3단부터 8단까지 출력되는 자바 코드를 작성하시오.

		int i;
		int k;

		for (i = 3; i < 9; i++) {
			for (k = 1; k < 10; k++) {
				System.out.println(i + "X" + k + "=" + (i * k));
			}
			System.out.println();
		}

	}

}

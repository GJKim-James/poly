
public class Midterm_Q5 {

	public static void main(String[] args) {
		
		// 4의 배수를 제외한 숫자 중 1부터 10까지 합계를 계산하는 자바 코드를 작성하시오.

		int i;
		int sum = 0;

		for (i = 1; i < 11; i++) {
			if (i % 4 != 0) {
				sum += i;
			}
		}
		System.out.println("출력결과 : " + sum);

	}

}

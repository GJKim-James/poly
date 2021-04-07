
public class Quiz1 {

	public static void main(String[] args) {

		// for 문을 이용하여 3부터 8까지의 합계를 구하시오.

		int hap = 0;
		int i;

		for (i = 3; i <= 8; i++) {
			hap = hap + i;
//			hap += i;

		}
		System.out.println("3부터 8까지의 합 : " + hap);

	}

}

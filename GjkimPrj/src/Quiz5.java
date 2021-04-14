
public class Quiz5 {

	public static void main(String[] args) {

		// while 문을 이용하여 3단부터 8단까지 출력하시오. 단, 3단과 5단일 경우 <3단>과 <5단>을 출력하시오.

		int i;
		int k;

		i = 3;
		while (i < 9) {
			if (i == 3 || i == 5) {
				System.out.println("<" + i + "단>");
			}

			k = 1;
			while (k < 10) {
				System.out.println(i + "x" + k + "=" + (i * k));
				k++;
			}
			System.out.println();
			i++;
		}

	}

}


public class Ex06_14 {

	public static void main(String[] args) {

		int i, k;

		for (i = 2; i < 10; i++) {

			System.out.println("[" + i + "´Ü]");

			for (k = 1; k < 10; k++) {

				System.out.println(i + "x" + k + "=" + (i * k));
			}

			System.out.println();
		}
	}

}

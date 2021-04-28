
public class Midterm_Q6 {

	public static void main(String[] args) {
		
		// º° Âï±â

		int i;
		int j;
		int k = 1;

		for (i = 0; i < 9; i++) {
			for (j = 0; j < 5; j++) {
				if (j < k) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i < 4) {
				k++;
			} else {
				k--;
			}
			System.out.println();
		}

	}

}

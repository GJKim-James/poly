
public class Quiz5 {

	public static void main(String[] args) {

		// while ���� �̿��Ͽ� 3�ܺ��� 8�ܱ��� ����Ͻÿ�. ��, 3�ܰ� 5���� ��� <3��>�� <5��>�� ����Ͻÿ�.

		int i;
		int k;

		i = 3;
		while (i < 9) {
			if (i == 3 || i == 5) {
				System.out.println("<" + i + "��>");
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

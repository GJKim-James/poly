
public class Ex08_04_1 {

	public static void main(String[] args) {
		// ����, �޸𸮿� �ø��� ���(ǥ�� ���)�� �پ��ϴ�.

		int aa[] = { 100, 200, 300, 400 }; // ���� ���� ����Ѵ�.
		int[] abc = { 100, 200, 300, 400 };

		int bb[] = new int[] { 100, 200, 300 };

		int cc[];
		cc = new int[] { 100, 200 };

		int[] dd = new int[1];
		dd[0] = 100;

		for (int i = 0; i < aa.length; i++) { // int �� ���� ���� �����̱� ������ for �� �������� ����. ������ �ȵȴ�. 
			System.out.println("aa[" + i + "] : " + aa[i]);
		}
		System.out.println();

		for (int i = 0; i < abc.length; i++) {
			System.out.println("abc[" + i + "] : " + abc[i]);
		}
		System.out.println();

		for (int i = 0; i < bb.length; i++) {
			System.out.println("bb[" + i + "] : " + bb[i]);
		}
		System.out.println();

		for (int i = 0; i < cc.length; i++) {
			System.out.println("cc[" + i + "] : " + cc[i]);
		}
		System.out.println();
		
		for (int i = 0; i < dd.length; i++) {
			System.out.println("dd[" + i + "] : " + dd[i]);
		}
		System.out.println();

	}

}

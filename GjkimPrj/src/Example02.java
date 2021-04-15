import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a;
		int b;
		int c;
		int result;

		System.out.print("Ã¹ ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
		a = s.nextInt();

		System.out.print("<1>µ¡¼À <2>»¬¼À <3>°ö¼À <4>³ª´°¼À : ");
		b = s.nextInt();

		System.out.print("µÎ ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
		c = s.nextInt();

		if (b == 1) {
			result = a + c;
			System.out.println(a + "+" + c + "=" + result);
		}
		if (b == 2) {
			result = a - c;
			System.out.println(a + "-" + c + "=" + result);
		}
		if (b == 3) {
			result = a * c;
			System.out.println(a + "x" + c + "=" + result);
		}
		if (b == 4) {
			result = a / c;
			System.out.println(a + "/" + c + "=" + result);
		}

	}

}

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int money;
		int c500, c100, c50, c10;

		System.out.printf("��ȯ�� ����? ");
		money = s.nextInt();

		c500 = money / 500;
		money %= 500;

		c100 = money / 100;
		money %= 100;

		c50 = money / 50;
		money %= 50;

		c10 = money / 10;
		money %= 10;

		System.out.println("500��¥�� : " + c500 + "��");
		System.out.println("100��¥�� : " + c100 + "��");
		System.out.println("50��¥�� : " + c50 + "��");
		System.out.println("10��¥�� : " + c10 + "��");
		System.out.println("��ȯ���� ���� �ܵ� : " + money + "��");

	}

}

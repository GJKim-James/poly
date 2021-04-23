import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int money;
		int c500, c100, c50, c10;

		System.out.printf("교환할 돈은? ");
		money = s.nextInt();

		c500 = money / 500;
		money %= 500;

		c100 = money / 100;
		money %= 100;

		c50 = money / 50;
		money %= 50;

		c10 = money / 10;
		money %= 10;

		System.out.println("500원짜리 : " + c500 + "개");
		System.out.println("100원짜리 : " + c100 + "개");
		System.out.println("50원짜리 : " + c50 + "개");
		System.out.println("10원짜리 : " + c10 + "개");
		System.out.println("교환하지 못한 잔돈 : " + money + "원");

	}

}

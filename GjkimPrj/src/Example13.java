import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("������ �� �ٷ� ���� �Ͽ� �Է��ϼ��� : ");
		String str[] = s.nextLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		
		char k = str[1].charAt(0);
		
		int b = Integer.parseInt(str[2]);
		
		switch (k) {
		case '+':
			System.out.printf("%d + %d = %d �Դϴ�.", a, b, a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d �Դϴ�.", a, b, a-b);
			break;
		case '*':
			System.out.printf("%d * %d = %d �Դϴ�.", a, b, a*b);
			break;
		case '/':
			System.out.printf("%d / %d = %d �Դϴ�.", a, b, a/b);
			break;
		case '%':
			System.out.printf("%d %% %d = %d �Դϴ�.", a, b, a%b);
			break;
		default:
			System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
		}

	}

}

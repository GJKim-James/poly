import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("수식을 한 줄로 띄어쓰기 하여 입력하세요 : ");
		String str[] = s.nextLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		
		char k = str[1].charAt(0);
		
		int b = Integer.parseInt(str[2]);
		
		switch (k) {
		case '+':
			System.out.printf("%d + %d = %d 입니다.", a, b, a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d 입니다.", a, b, a-b);
			break;
		case '*':
			System.out.printf("%d * %d = %d 입니다.", a, b, a*b);
			break;
		case '/':
			System.out.printf("%d / %d = %d 입니다.", a, b, a/b);
			break;
		case '%':
			System.out.printf("%d %% %d = %d 입니다.", a, b, a%b);
			break;
		default:
			System.out.println("연산자를 잘못 입력했습니다.");
		}

	}

}

import java.util.Scanner;

public class Example01 { // 예제모음 01

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
		int result;
		
		System.out.print("첫 번째 계산할 값을 입력하세요 : ");
		a = s.nextInt();
		
		System.out.print("두 번째 계산할 값을 입력하세요 : ");
		b = s.nextInt();
		
		System.out.print("세 번째 계산할 값을 입력하세요 : ");
		c = s.nextInt();
		
		System.out.print("네 번째 계산할 값을 입력하세요 : ");
		d = s.nextInt();
		
		result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

	}

}

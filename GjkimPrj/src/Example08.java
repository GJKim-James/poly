import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// 실수 2개를 입력받아 다양한 연산 출력하기
		
		Scanner s = new Scanner(System.in);
		
		float a;
		float b;
		float result;
		
		System.out.printf("첫 번째 계산할 값을 입력하세요 : ");
		a = s.nextFloat();
		
		System.out.printf("두 번째 계산할 값을 입력하세요 : ");
		b = s.nextFloat();
		
		result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		System.out.printf("%5.2f + %5.2f = %5.2f \n", a, b, result);
		System.out.println();
		
		result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		System.out.printf("%5.2f - %5.2f = %5.2f \n", a, b, result);
		System.out.println();
		
		result = a * b;
		System.out.println(a + " X " + b + " = " + result);
		System.out.printf("%5.2f * %5.2f = %5.2f \n", a, b, result);
		System.out.println();
		
		result = a / b;
		System.out.println(a + " / " + b + " = " + result);
		System.out.printf("%5.2f / %5.2f = %5.2f \n", a, b, result);
		System.out.println();
		
		result = (int) a % (int) b; // 나머지 연산을 위해 실수를 정수로 강제 형 변환.
		System.out.println(a + " % " + b + " = " + result);
		System.out.printf("%d %% %d = %d \n", (int) a, (int) b, (int) result);

	}

}

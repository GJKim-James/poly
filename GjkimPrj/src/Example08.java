import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// �Ǽ� 2���� �Է¹޾� �پ��� ���� ����ϱ�
		
		Scanner s = new Scanner(System.in);
		
		float a;
		float b;
		float result;
		
		System.out.printf("ù ��° ����� ���� �Է��ϼ��� : ");
		a = s.nextFloat();
		
		System.out.printf("�� ��° ����� ���� �Է��ϼ��� : ");
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
		
		result = (int) a % (int) b; // ������ ������ ���� �Ǽ��� ������ ���� �� ��ȯ.
		System.out.println(a + " % " + b + " = " + result);
		System.out.printf("%d %% %d = %d \n", (int) a, (int) b, (int) result);

	}

}

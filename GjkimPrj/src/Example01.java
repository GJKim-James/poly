import java.util.Scanner;

public class Example01 { // �������� 01

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
		int result;
		
		System.out.print("ù ��° ����� ���� �Է��ϼ��� : ");
		a = s.nextInt();
		
		System.out.print("�� ��° ����� ���� �Է��ϼ��� : ");
		b = s.nextInt();
		
		System.out.print("�� ��° ����� ���� �Է��ϼ��� : ");
		c = s.nextInt();
		
		System.out.print("�� ��° ����� ���� �Է��ϼ��� : ");
		d = s.nextInt();
		
		result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

	}

}

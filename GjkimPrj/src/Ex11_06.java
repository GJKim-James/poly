class Car2 { // Ex11_01�� class �̸��� 'Car'�̱� ������ 'Car2'�� ����.
	private String color;
	private int speed;
	
	Car2() { // ������
		System.out.println("�� �޸𸮸� ������ �� �ڵ����� ����Ǵ� �������̴�.");
		
		this.color = "����"; // this�� ���� �ڱ� �ڽ��� �����ϰ� �ִ� Ŭ������ ����Ų��.
		this.speed = 0;
		
		System.out.println("�� �޸� ���� ��");
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}

public class Ex11_06 {

	public static void main(String[] args) {
		
		Car2 myCar1 = new Car2();
		Car2 myCar2 = new Car2();
		
		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() + "�̸�, ���� �ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() + "�̸�, ���� �ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");

	}

}

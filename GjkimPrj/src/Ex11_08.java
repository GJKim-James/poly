class Car3 {
	private String color;
	private int speed;
	
	Car3() {
	}
	
	Car3(String color) {
		this.color = color;
	}
	
	Car3(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}
public class Ex11_08 {

	public static void main(String[] args) {
		
		Car3 myCar1 = new Car3();
		Car3 myCar2 = new Car3("����");
		Car3 myCar3 = new Car3("�Ķ�", 30);
		
		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() + "�̸�, ���� �ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() + "�̸�, ���� �ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���3�� ������ " + myCar3.getColor() + "�̸�, ���� �ӵ��� " + myCar3.getSpeed() + "km �Դϴ�.");

	}

}

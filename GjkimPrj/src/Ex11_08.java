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
		Car3 myCar2 = new Car3("빨강");
		Car3 myCar3 = new Car3("파랑", 30);
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재 속도는 " + myCar2.getSpeed() + "km 입니다.");
		System.out.println("자동차3의 색상은 " + myCar3.getColor() + "이며, 현재 속도는 " + myCar3.getSpeed() + "km 입니다.");

	}

}

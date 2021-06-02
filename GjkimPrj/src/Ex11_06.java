class Car2 { // Ex11_01에 class 이름이 'Car'이기 때문에 'Car2'로 지정.
	private String color;
	private int speed;
	
	Car2() { // 생성자
		System.out.println("난 메모리를 생성할 때 자동으로 실행되는 생성자이다.");
		
		this.color = "빨강"; // this는 현재 자기 자신이 존재하고 있는 클래스를 가리킨다.
		this.speed = 0;
		
		System.out.println("난 메모리 생성 끝");
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
		
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재 속도는 " + myCar2.getSpeed() + "km 입니다.");

	}

}

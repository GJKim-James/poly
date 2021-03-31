
public class Ex06_07 {

	public static void main(String[] args) {
		
		int hap = 0; // Main 함수가 실행되는 동안만 살아있는 변수(지역 변수)
		int i;
		
		for (i = 1; i <= 10; i++) {
			hap = hap + i;
			
		}
		
		System.out.println("1에서 10까지의 합 : " + hap);

	}

}

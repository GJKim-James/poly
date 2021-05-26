
public class Method { // new 방식은 Class 단위를 올림, static 방식은 Method, var(변수) 올림

	public static void main(String[] args) { // static 키워드로 메모리에 올렸기 때문에 실행 가능

		System.out.println("-----main 함수 시작-----"); // 실행 순서 잘 파악하기
		
		int res = sum(4, 6);
		System.out.println("Res : " + res);
		
		System.out.println("-----main 함수 끝-----");

	}

	public static int sum(int i1, int i2) { // static 키워드로 메모리에 올렸기 때문에 실행 가능

		System.out.println("---sum 함수 시작---");

		int sum = 0;

		for (int i = i1; i <= i2; i++) {
			sum += i;
		}

		System.out.println("---sum 함수 끝---");
		
		return sum;
	}

}

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {

		List<String> rList = new ArrayList<>(); // List 인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클래스를 통해 메모리를 올림

		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동"); // List 컬렉션 프레임워크에 4개의 데이터를 추가함

		System.out.println("List 크기 : " + rList.size()); // 배열의 크기 출력

		for (int i = 0; i < rList.size(); i++) { // size를 통해 크기를 알 수 있기 때문에 for문 사용
			System.out.println("[" + i + "]번째 배열 기억 공간 : " + rList.get(i));
		}

	}

}

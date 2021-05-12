import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam2 {

	public static void main(String[] args) {

		List<String> rList = new ArrayList<>();

		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");

		System.out.println("List 크기 : " + rList.size());

		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]번째 배열 기억 공간 : " + rList.get(i));
		}
		
		// List를 사용할 때 Iterator는 꼭 같이 쓴다.
		Iterator<String> it = rList.iterator(); // while문을 사용하기 위한 반복의 조건을 알기 위해서 Iterator를 사용(반복의 조건을 알 수 있도록 데이터 구조 변경)
		
		while (it.hasNext()) { // List 컬렉션을 통해 저장된 데이터를 가져올 때 for문을 쓰지 않고, while문을 쓰길 권장함
			String name = (String) it.next();

			System.out.println("이름 : " + name);
		}

	}

}

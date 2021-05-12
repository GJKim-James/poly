import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {

		// HashMap 데이터 타입 정의 시 키와 값에 저장될 데이터 타입을 정의하며, 메모리에 올림
		Map<String, String> map = new HashMap<>();

		// 키와 값을 쌍으로 데이터 추가하기
		map.put("name", "김광진");
		map.put("email", "gjk0635@naver.com");
		map.put("dept", "데이터분석과");

		// 데이터 불러오기
		System.out.println("-------------------------");
		System.out.println("name : " + map.get("name"));
		System.out.println("email : " + map.get("email"));
		System.out.println("dept : " + map.get("dept"));
		System.out.println(map.get("오타"));
		System.out.println("-------------------------");

	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListMapExam {

	public static void main(String[] args) {
		
		List<Map<String, String>> rList = new ArrayList<Map<String,String>>();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "김광진");
		map.put("email", "gjk0635@naver.com");
		map.put("address", "수원");
		map.put("dept", "데이터분석과");
		
		rList.add(map);
		
		map = null; // map의 값을 메모리에서 날려버려라(초기화)
		
		map = new HashMap<String, String>();
		
		map.put("name", "홍길동");
		map.put("email", "gdhong@naver.com");
		map.put("address", "수원");
		map.put("dept", "데이터분석과");
		
		rList.add(map);
		
		map = null; // map의 값을 메모리에서 날려버려라(초기화)
		
		Iterator<Map<String, String>> it = rList.iterator();
		
		System.out.println("------------------------");
		while (it.hasNext()) {
			Map<String, String> rMap = it.next();
			
			System.out.println("이름 : " + rMap.get("name"));
			System.out.println("이메일 : " + rMap.get("email"));
			System.out.println("주소 : " + rMap.get("address"));
			System.out.println("부서 : " + rMap.get("dept"));
			
			System.out.println("------------------------");
		}

	}

}

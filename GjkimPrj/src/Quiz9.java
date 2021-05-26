import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz9 {

	public static void main(String[] args) {
		
		List<Map<String, String>> rList = new ArrayList<Map<String, String>>();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "이협건");
		map.put("Email", "h.lee@");
		map.put("addr", "서울");
		
		rList.add(map);
		
		map = null;
		
		map = new HashMap<String, String>();
		
		map.put("name", "홍길동");
		map.put("Email", "g.hong@");
		map.put("addr", "서울");
		
		rList.add(map);
		
		map = null;
		
		Iterator<Map<String, String>> it = rList.iterator();
		
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			
			System.out.println("이름 : " + rMap.get("name"));
			System.out.println("이메일 : " + rMap.get("Email"));
			System.out.println("주소 : " + rMap.get("addr"));
			System.out.println();
		}

	}

}

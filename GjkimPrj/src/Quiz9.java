import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz9 {

	public static void main(String[] args) {
		
		List<Map<String, String>> rList = new ArrayList<Map<String, String>>();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "������");
		map.put("Email", "h.lee@");
		map.put("addr", "����");
		
		rList.add(map);
		
		map = null;
		
		map = new HashMap<String, String>();
		
		map.put("name", "ȫ�浿");
		map.put("Email", "g.hong@");
		map.put("addr", "����");
		
		rList.add(map);
		
		map = null;
		
		Iterator<Map<String, String>> it = rList.iterator();
		
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			
			System.out.println("�̸� : " + rMap.get("name"));
			System.out.println("�̸��� : " + rMap.get("Email"));
			System.out.println("�ּ� : " + rMap.get("addr"));
			System.out.println();
		}

	}

}

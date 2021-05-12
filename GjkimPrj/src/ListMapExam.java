import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListMapExam {

	public static void main(String[] args) {
		
		List<Map<String, String>> rList = new ArrayList<Map<String,String>>();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "�豤��");
		map.put("email", "gjk0635@naver.com");
		map.put("address", "����");
		map.put("dept", "�����ͺм���");
		
		rList.add(map);
		
		map = null; // map�� ���� �޸𸮿��� ����������(�ʱ�ȭ)
		
		map = new HashMap<String, String>();
		
		map.put("name", "ȫ�浿");
		map.put("email", "gdhong@naver.com");
		map.put("address", "����");
		map.put("dept", "�����ͺм���");
		
		rList.add(map);
		
		map = null; // map�� ���� �޸𸮿��� ����������(�ʱ�ȭ)
		
		Iterator<Map<String, String>> it = rList.iterator();
		
		System.out.println("------------------------");
		while (it.hasNext()) {
			Map<String, String> rMap = it.next();
			
			System.out.println("�̸� : " + rMap.get("name"));
			System.out.println("�̸��� : " + rMap.get("email"));
			System.out.println("�ּ� : " + rMap.get("address"));
			System.out.println("�μ� : " + rMap.get("dept"));
			
			System.out.println("------------------------");
		}

	}

}

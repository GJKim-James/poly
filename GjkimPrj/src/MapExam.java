import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {

		// HashMap ������ Ÿ�� ���� �� Ű�� ���� ����� ������ Ÿ���� �����ϸ�, �޸𸮿� �ø�
		Map<String, String> map = new HashMap<>();

		// Ű�� ���� ������ ������ �߰��ϱ�
		map.put("name", "�豤��");
		map.put("email", "gjk0635@naver.com");
		map.put("dept", "�����ͺм���");

		// ������ �ҷ�����
		System.out.println("-------------------------");
		System.out.println("name : " + map.get("name"));
		System.out.println("email : " + map.get("email"));
		System.out.println("dept : " + map.get("dept"));
		System.out.println(map.get("��Ÿ"));
		System.out.println("-------------------------");

	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz8 {

	public static void main(String[] args) {

		List<String> rList = new ArrayList<>();

		rList.add("��ü�������α׷�");
		rList.add("�ϵ�");
		rList.add("MongoDB");

		int i = 0;
		while (i < rList.size()) {
			if (i == 0) {
				System.out.print("<");
				System.out.print(rList.get(i));
				System.out.print(">");
			} else {
				System.out.print(rList.get(i));
			}
			System.out.println();
			i++;
		}

	}

}

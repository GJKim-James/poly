package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	// �Լ� ��ü ������ ������ �߻����� ��� SQLException���� ó��.(�޸� ������ ���� ���ϴ� ���� ����)
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		String user = "myUser"; // ����Ŭ ���̵�
		String passwd = "1234"; // ����Ŭ �н�����

		// ����ġ ���� ��ְ� �߻����� �� ���(����, ��ó)�ϱ� ���� ���� ó���� �ʿ��ϴ�.
		try { // �ڵ� �߿��� ������ �� �� �ִ� �κ�(����)�� ����. �����ڴ� � ������ �߻��� �� �ִ��� ���� ����.
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Ŭ������ Ʋ���� ���
			conn = DriverManager.getConnection(url, user, passwd); // url, user, passwd�� Ʋ���� ���

			System.out.println("����Ŭ ���� ����!!");

			// try���� ��ְ� �߻��ϸ� catch(�ڵ� �ۼ� �������)�� �Ѿ��.
		} catch (ClassNotFoundException e) { // Exception�� �ڽ� �� �ϳ�. ���� �� �������� ����.
			System.out.println("����Ŭ ���� ����");
			System.out.println("ojbdc6.jar ���Ͽ� �����ϴ� �ڹ� ������ ã�� ����");
			System.out.println("���� : " + e.toString());

		} catch (Exception e) { // Exception�� �θ��̱� ������ �׻� ���� �������� �ۼ�.
			System.out.println("����Ŭ ���� ���� - ���� Exception���� ȣ����");
			System.out.println("���� : " + e.toString());

		} finally { // �ʼ��� �ƴ�����, ���ִ°� ����. ������ ����Ǵ� ����(�߰��� ������ ���� �� ����ǰ� �ִ� ��찡 ���� ��;�޸� ����, �� ��쿡
					// ��������� �� �ִ� ����)

			if (conn != null) {
				conn.close();

			}
		}

		conn = null;

	}

}

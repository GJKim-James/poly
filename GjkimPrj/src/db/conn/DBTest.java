package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	// 함수 전체 내에서 에러가 발생했을 경우 SQLException에서 처리.(메모리 누수를 막지 못하는 단점 있음)
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		String user = "myUser"; // 오라클 아이디
		String passwd = "1234"; // 오라클 패스워드

		// 예상치 못한 장애가 발생했을 때 방어(대응, 대처)하기 위해 예외 처리가 필요하다.
		try { // 코드 중에서 에러가 날 수 있는 부분(영역)을 지정. 개발자는 어떤 에러가 발생할 수 있는지 예측 가능.
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 클래스가 틀렸을 경우
			conn = DriverManager.getConnection(url, user, passwd); // url, user, passwd가 틀렸을 경우

			System.out.println("오라클 접속 성공!!");

			// try에서 장애가 발생하면 catch(코드 작성 순서대로)로 넘어간다.
		} catch (ClassNotFoundException e) { // Exception의 자식 중 하나. 조금 더 디테일한 에러.
			System.out.println("오라클 접속 실패");
			System.out.println("ojbdc6.jar 파일에 존재하는 자바 파일을 찾지 못함");
			System.out.println("이유 : " + e.toString());

		} catch (Exception e) { // Exception은 부모이기 때문에 항상 제일 마지막에 작성.
			System.out.println("오라클 접속 실패 - 최종 Exception까지 호출함");
			System.out.println("이유 : " + e.toString());

		} finally { // 필수는 아니지만, 써주는게 좋다. 무조건 실행되는 구문(중간에 에러가 났을 때 실행되고 있는 경우가 있을 것;메모리 누수, 그 경우에
					// 적용시켜줄 수 있는 구문)

			if (conn != null) {
				conn.close();

			}
		}

		conn = null;

	}

}

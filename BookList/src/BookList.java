import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
	Connection con; // 연결
	Statement stmt; // 쿼리, 질의
	ResultSet rs; // 결과집합
	
	public BookList() {
		// 오라클DB 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang";
		String pwd = "madang";
		
		try { // 드라이버 찾는 과정
			// 강제로 특정 클래스를 메모리에 올리기
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 드라이버
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try { // 데이터베이스 연결하는 과정
			System.out.println("데이터베이스 연결 준비 ...");
			// 메모리에 올라간 드라이버를 이용해서 특정 DB에 접속
			// 연결에 성공하면 Connection 객체를 리턴 -> 연결성공의 의미
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터 베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void sqlRun() {
		String query = "SELECT * FROM Book"; // SQL문
		
		try { // 데이터베이스에 질의 결과를 가져오는 과정
			stmt = con.createStatement();
			// sql문 실행. SELECT문일 경우 executeQuery() 호출해서
						// ResultSet 타입의 테이블 형식으로 결과를 가져옴
			rs = stmt.executeQuery(query);
			
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			
			while(rs.next()) { // 한줄씩 읽음
				System.out.print("\t"+rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t"+rs.getInt(4));
			}
			
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		BookList so = new BookList();
		so.sqlRun();
	}
}
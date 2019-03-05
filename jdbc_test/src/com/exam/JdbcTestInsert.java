package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTestInsert {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		ResultSet rs = null; // 결과셋트(SELECT문일때만 사용)
		
		// H2DB 드라이버
		String driverName = "org.h2.Driver";
		// H2DB 접속정보
		String url ="jdbc:h2:tcp://localhost/~/h2db";
		String user = "sa";
		String password = "";
		String sql = "";
		
		// 사용자 입력값을 변수로 받았다고 가정
		int id = 3; //Integer.pasrseInt("1");
		String name = "송혜교";
		
		try {
			// 강제로 특정 클래스를 메모리에 올리기
			Class.forName(driverName);
			// 메모리에 올라간 드라이버를 이용해서 특정 DB에 접속
			// 연결에 성공하면 Connection 객체를 리턴 -> 연결성공의 의미
			con = DriverManager.getConnection(url, user, password);
			
			sql="INSERT INTO member (id, name, reg_date)";
			sql+=" VALUES (?, ?, CURRENT_TIMESTAMP)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id); //물음표 1번자리에 int형으로 설정  - 테이블 정수형 컬럼과 호환
			pstmt.setString(2, name); //물음표 2번자리에 String형으로 설정 - 테이블 varchar형 컬럼과 호환
			//sql문 실행
			int count = pstmt.executeUpdate(); //insert문 DB서버로 전송하여 실행
			System.out.println(count+"개의 행이 추가됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

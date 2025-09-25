package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private Connection conn;
	
	public Connection open() {
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "server";
		String pw = "java1234";
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//db 접속
			conn = DriverManager.getConnection(url, id, pw); // 실제 접속 완료
			
			//연결 직후 ~ 트랜잭션 설정  ~ SQL 실행
			//conn.setAutoCommit(false);
			
			
			
			
			return conn;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public void close() {
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection open(String server, String id, String pw) {
			
			
			String url = "jdbc:oracle:thin:@" + server + ":1521:xe";
			
			try {
				//드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//db 접속
				conn = DriverManager.getConnection(url, id, pw); // 실제 접속 완료
				
				return conn;
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
			
		}

}

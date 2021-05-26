package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {
	
	public static int result = 0;

	public static void main(String[] args) {
		
		
		// 1. 드라이버 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 성공!!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패 : " +e.getMessage());
		}
		
		Connection con = null;
		
		//3. SQL 문을 전송할 수 있는 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;
		
		try {
			
			//2. 데이터베이스와 연결하는 Connection 객체 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","scott","tiger"); 
																		//url , user , password
			
			Statement stmt = con.createStatement();
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into member(num, name, addr, sex) ");
			sql.append("values(?,?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			//4. 바인딩 변수 설정하기
			pstmt.setInt(1, 104);
			pstmt.setString(2, "곽춘식");
			pstmt.setString(3, "함평");
			pstmt.setString(4, "F");
			
			//5.SQL문을 전송한다.
			result = pstmt.executeUpdate();
			System.out.println("갱신된 행의 개수 : " +result);
			
			stmt.close();
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 실패 : " +e.getMessage());
			System.err.println(e.getSQLState());
		} finally {
			//6. 모든자원을 반납한다.
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		
	}

}

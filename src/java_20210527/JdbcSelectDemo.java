package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {

	public static void main(String[] args) {
		
		// 1. 드라이브를 로드 한다 
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패 : "+e.getMessage());
		}
		// 2. 데이터베이스와 연결 할 수 있는 Conncetion 객체 생성
		Connection con = null;
		//3. SQL 문을 전송할 수 있는 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","scott","tiger");
			
			StringBuilder sql = new StringBuilder();
			sql.append("select num,name,addr,sex ");
			sql.append("from member ");
			sql.append("order by num desc ");
			sql.append("limit ?,?");
			
			pstmt = con.prepareStatement(sql.toString());
			//4. 바인딩 변수 설정
			int index = 1;
			pstmt.setInt(index++, 0);
			pstmt.setInt(index++, 4);
			
			
			// 6. ResultSet에서 데이터를 추출 -> getXXX(index)
			rs = pstmt.executeQuery();
			System.out.println("num\tname\taddr\tsex");
			while(rs.next()) {
				index = 1;
				System.out.println(rs.getInt(index++) + "\t" +rs.getString(index++)+ "\t"
								+rs.getString(index++)+ "\t" +rs.getString(index++));
			}
			System.out.println("출력 완료 ! ");
			
			
		} catch (SQLException e) {
			System.err.println("DB 연결 실패 : "+e.getMessage());
		} finally {
			//모든 자원 반납.
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
			
		}
		
		
		
		
	}

}

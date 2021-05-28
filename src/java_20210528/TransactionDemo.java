package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	
	public static int result = 0;

	public static void main(String[] args) {
		MemberDto dto = new MemberDto(200,"문건이","부산","M");
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패.. : "+e.getMessage());
		}
		
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc","scott","tiger");
			Statement stmt = con.createStatement();
			
			//트랜잭션 시작
			con.setAutoCommit(false);
			StringBuilder sql = new StringBuilder();
			
			sql.append("insert into member values");
			sql.append("(?,?,?,?)");
			int index = 1;
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());
			pstmt.setString(index++, dto.getSex());
			
			result = pstmt.executeUpdate();
			success = true;
			
			stmt.close();
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 실패 :"+e.getMessage());
		} finally {
			if(success) {
				try {
					con.commit();
					System.out.print("commit 성공 , ");
					System.out.println("결과 행 수 : " +result);
				} catch (SQLException e) {
					System.err.println("commit 실패 : " +e.getMessage());
				}
			}
			else {
				try {
					con.rollback();
					System.out.print("commit 실패 , ");
					System.out.println("결과 행 수 : " +result);
				} catch (SQLException e) {
					System.err.println("rollback 실패 : " +e.getMessage());
				}
			}
			
			try {
				con.setAutoCommit(true);
				if(con != null) con.close();
				if(pstmt!=null) pstmt.close();
				if(pstmt2!=null) pstmt2.close();
			}catch (SQLException e) {
				System.err.println("오류 :"+e.getMessage());
			}
			
		}
	}

}

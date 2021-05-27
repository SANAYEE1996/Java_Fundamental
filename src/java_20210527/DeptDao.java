package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeptDao {
	
	public static int result = 0;
	
	private static DeptDao single;

	private DeptDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 성공!!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패 : " +e.getMessage());
		}
	}

	public static DeptDao getInstance() {
		if (single == null) {
			single = new DeptDao();
		}
		return single;
	}
	
	public boolean insert(DeptDto dto) {
		boolean isSuccess = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","scott","tiger"); 
			
			Statement stmt = con.createStatement();
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into dept values");
			sql.append("(?,?,?)");
			
			int index = 1;
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getLoc());
			
			
			isSuccess = true;
			result = pstmt.executeUpdate();
			System.out.println("갱신된 행의 개수 : " +result);
			
			stmt.close();
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 실패 : " +e.getMessage());
			System.err.println(e.getSQLState());
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return isSuccess;
	}

	public boolean update(String name, int num) {
		boolean isSuccess = false;

		Connection con = null;
		
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "scott", "tiger");

			Statement stmt = con.createStatement();

			StringBuilder sql = new StringBuilder();
			sql.append("update dept set dname = ? where deptno = ?");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, name);
			pstmt.setInt(index++, num);
			isSuccess = true;
			
			result = pstmt.executeUpdate();
			System.out.println("갱신된 행의 개수 : " + result);
			
			stmt.close();
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 실패 : " + e.getMessage());
			System.err.println(e.getSQLState());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		
		return isSuccess;
	}

	public boolean delete(int num) {
		boolean isSuccess = false;
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "scott", "tiger");

			Statement stmt = con.createStatement();

			StringBuilder sql = new StringBuilder();
			sql.append("delete from dept where deptno = ?");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
			System.out.println("갱신된 행의 개수 : " + result);
			
			isSuccess = true;
			
			stmt.close();
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 실패 : " + e.getMessage());
			System.err.println(e.getSQLState());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		
		return isSuccess;
	}

	public ArrayList<DeptDto> select() {
		ArrayList<DeptDto> list = new ArrayList<>();
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","scott","tiger");
			
			StringBuilder sql = new StringBuilder();
			sql.append("select * from dept");
			
			pstmt = con.prepareStatement(sql.toString());
			int index;
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1;
				DeptDto d = new DeptDto();
				d.setNum(rs.getInt(index++));
				d.setName(rs.getString(index++));
				d.setLoc(rs.getString(index++));
				list.add(d);
			}
		} catch (SQLException e) {
			System.err.println("DB 연결 실패 : "+e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
			
		}
		return list;
	}
	
	
	

}

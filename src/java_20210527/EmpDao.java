package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDao {
	public static int result = 0;
	
	private static EmpDao single;

	private EmpDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 성공!!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패 : " +e.getMessage());
		}
	}

	public static EmpDao getInstance() {
		if (single == null) {
			single = new EmpDao();
		}
		return single;
	}
	
	public boolean insert(EmpDto dto) {
		boolean isSuccess = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","scott","tiger"); 
			
			Statement stmt = con.createStatement();
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into emp values");
			sql.append("(?,?,?,?,?,?,?,?)");
			
			int index = 1;
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index++, dto.getEmpno());
			pstmt.setString(index++, dto.getEname());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setString(index++, dto.getHiredate());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index++, dto.getDeptno());
			
			
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

	public boolean update(EmpDto dto) {
		boolean isSuccess = false;

		Connection con = null;
		
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "scott", "tiger");

			Statement stmt = con.createStatement();

			StringBuilder sql = new StringBuilder();
			sql.append("update emp set sal = ? where empno = ?");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setInt(index++, dto.getEmpno());
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

	public boolean delete(int empno) {
		boolean isSuccess = false;
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "scott", "tiger");

			Statement stmt = con.createStatement();

			StringBuilder sql = new StringBuilder();
			sql.append("delete from emp where empno = ?");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, empno);
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

	public ArrayList<EmpDto> select(int i, int j) {
		ArrayList<EmpDto> list = new ArrayList<>();
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","scott","tiger");
			
			StringBuilder sql = new StringBuilder();
			sql.append("select * from emp ");
			sql.append("order by sal desc ");
			sql.append("limit ?,?");
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, i);
			pstmt.setInt(index++, j);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1;
				EmpDto d = new EmpDto();
				d.setEmpno(rs.getInt(index++));
				d.setEname(rs.getString(index++));
				d.setJob(rs.getString(index++));
				d.setMgr(rs.getInt(index++));
				d.setHiredate(rs.getString(index++));
				d.setSal(rs.getDouble(index++));
				d.setComm(rs.getDouble(index++));
				d.setDeptno(rs.getInt(index++));
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

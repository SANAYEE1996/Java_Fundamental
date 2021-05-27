package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCtest {

	public static int result = 0;

	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 성공!!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패 : " + e.getMessage());
		}

		Connection con = null;

		PreparedStatement pstmt = null;

		ResultSet r = null;
		Scanner sc = new Scanner(System.in);

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "scott", "tiger");
			// url , user , password

			Statement stmt = con.createStatement();

			StringBuilder sql = new StringBuilder();

			int id = 0;
			String name = "";
			String addr = "";
			String sex = "";

			int num = 0;
			while (true) {
				System.out.println("기능을 선택 하시오 : 1(삽입) 2(업데이트) 3(삭제) 4(전체 행 조회) 5(종료)");
				num = sc.nextInt();
				if (num == 1) {
					try {
						System.out.println("삽입 할 아이디 입력 : ");
						id = sc.nextInt();
						System.out.println("삽입 할 이름 입력 : ");
						name = sc.next();
						System.out.println("삽입 할 주소 입력 : ");
						addr = sc.next();
						System.out.println("삽입 할 성별 입력 : ");
						sex = sc.next();

						sql.append("insert into member values(?,?,?,?)");
						pstmt = con.prepareStatement(sql.toString());

						pstmt.setInt(1, 10);
						pstmt.setString(2, name);
						pstmt.setString(3, addr);
						pstmt.setString(4, sex);

						result = pstmt.executeUpdate();
						System.out.println("갱신된 행의 개수 : " + result);
						sql.setLength(0);

					} catch (SQLException e) {
						System.err.println(e.getMessage());
					}
				} else if (num == 2) {
					try {
						System.out.println("업데이트 할 행의 아이디를 입력 하시오 : ");
						id = sc.nextInt();
						System.out.println("업데이트 할 이름을 입력 하시오 : ");
						name = sc.next();

						sql.append("update member set name = ? where num = ?");
						pstmt = con.prepareStatement(sql.toString());

						pstmt.setString(1, name);
						pstmt.setInt(2, id);

						result = pstmt.executeUpdate();
						System.out.println("갱신된 행의 개수 : " + result);
						sql.setLength(0);

					} catch (SQLException e) {
						System.err.println(e.getMessage());
					}
				} else if (num == 3) {
					try {
						System.out.println("삭제할 행의 아이디를 입력 하시오 : ");
						id = sc.nextInt();

						sql.append("delete from member where num = ?");
						pstmt = con.prepareStatement(sql.toString());

						pstmt.setInt(1, id);

						result = pstmt.executeUpdate();
						System.out.println("갱신된 행의 개수 : " + result);
						sql.setLength(0);
					} catch (SQLException e) {
						System.err.println(e.getMessage());
					}
				} else if (num == 4) {
					try {

						sql.append("select * from member");
						pstmt = con.prepareStatement(sql.toString());

						r = pstmt.executeQuery();
						System.out.println("num\tname\taddr\tsex");
						while (r.next()) {
							id = r.getInt(1);
							name = r.getString(2);
							addr = r.getString(3);
							sex = r.getString(4);
							System.out.println(id + "\t" + name + "\t" + addr + "\t" + sex);
						}
						System.out.println("전체 행 조회 완료.");
						sql.setLength(0);

					} catch (SQLException e) {
						System.err.println(e.getMessage());
					}
				} else if (num == 5) {
					sql.setLength(0);
					System.out.println("종료 되었습니다 ! ");
					break;
				} else {
					System.out.println("다시 입력 하세요");
					sql.setLength(0);
				}
			}
			
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
				if (r != null)
					r.close();
				if (sc != null)
					sc.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

	}

}

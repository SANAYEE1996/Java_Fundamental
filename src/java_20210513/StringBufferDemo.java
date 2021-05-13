package java_20210513;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("hello");
		StringBuffer s1 = new StringBuffer("hello");
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
		String str = s.toString();
		String str1 = s1.toString();
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name,age ");
		sql.append("from student ");
		sql.append("where sid > 2015");
		
		System.out.println(sql);
		
		//sql의 모든 문자열 지우기
		sql.setLength(0);
		sql.append("select * ");
		sql.append("from student");
		System.out.println(sql);
		
	}

}

package java_20210510;

public class MemberDemo {
	
	private static void print(Member m) {
		System.out.println(m.getName());
		System.out.println(m.getEmail());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getAge());
	}

	public static void main(String[] args) {
		
		Member m = new Member();
		m.setName("park young sang");
		m.setEmail("zzomin09@naver.com");
		m.setAddr1("NEW YORK");
		m.setAddr2("Switzerland");
		m.setAge(26);
		print(m);
	}

}

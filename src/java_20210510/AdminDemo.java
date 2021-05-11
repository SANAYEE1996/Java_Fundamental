package java_20210510;

public class AdminDemo {

	public static void main(String[] args) {
		Admin a = new Admin("dudtkd0219","3237","dudtkd0219@gmail.com",37);
		
		Admin a1 = new Admin();
		a1.setId("djdk@naver.com");
		a1.setPwd("3910dk");
		a1.setEmail("ddd");
		a1.setLevel(34);
		
		System.out.println(a1.getId());
		System.out.println(a1.getEmail());
		System.out.println(a1.getPwd());
		System.out.println(a1.getLevel());

	}

}

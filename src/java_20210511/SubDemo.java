package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		System.out.println(s.money);
		s.makeMoney();
		System.out.println(s.chicken);
		s.gotoSchool();
		
		s.play("gaazuuaaa");
		
		Super sup = new Sub();
		
		System.out.println(sup.money);
		
		sup.makeMoney();
		sup.play(" ");
		
		System.out.println(s.toString());
		System.out.println(s);
		
		
		Object ob = new Object();
		System.out.println(ob.toString());
	
	
	}

}

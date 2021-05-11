package java_20210506;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();

		c1.name = "박영상";
		c1.age = 26;
		c1.email = "dudtkd0219@gmail.com";
		c1.phone = "010-3237-0219";
		c1.balance = 1_000_000;
		c1.released = false;
		//클래스 변수(static)는 클래스 이름으로 접근 하는 것이 관례
		//변수로도 접근 간으하나 권장하지 않음 ex) c1.interestRate = 6.2;
		Customer.interestRate = 6.7;
		//final 변수는 재할당 할 수 없음
		//Customer.BANKNAME = "gukmin bank";

		System.out.println(	c1.name+"\t"+c1.age+"\t"+
							c1.email+"\t"+c1.phone+"\t"+
							c1.balance+"\t"+c1.released);
		
		Customer c2 = new Customer();
		
		c2.name = "태성원";
		c2.age = 29;
		c2.email = "goodboy@naver.com";
		c2.phone = "010-6648-6084";
		c2.balance = 1_000_000_000_000L;
		c2.released = true;
		
		System.out.println(	c2.name+"\t"+c2.age+"\t"+
							c2.email+"\t"+c2.phone+"\t"+
							c2.balance+"\t\t"+c2.released);
		
		Customer c3 = c2;
		c3.name = "변상진";
		
		System.out.println(c2.name+" "+c3.name);
		//System.out.println(c1.interestRate+" "+c2.interestRate);
		
		
		
	
	}

}

package java_20210507;

public class StaticMethodDemo {
	
	String name;
	static double interestRate;
	
	public void m1() {
		System.out.println("Instance methoe m1() 호출");
	}
	public void m2() {
		//instance method 에서는
		//모든 변수를 사용하고, 모든 메서드를 호출할 수 있음
		this.name = "박영상"; //this는 자기자신의 인스턴스
		StaticMethodDemo.interestRate = 3.4;
		this.m1();
		StaticMethodDemo.m3();
	}
	
	public static void m3() {
		System.out.println("Instance methoe m3() 호출");
	}
	
	public static void m4() {
		//static method 에서는 static 변수와 static 메서드만 사용할 수 있음.
		
		//name = "박수박";
		interestRate = 4.3;
		//m1();
		m3();
	}
	
	public static void main(String args[]) {
		m3();
		m4();
		interestRate = 5.6;
		
		StaticMethodDemo smd = new StaticMethodDemo();
		
		smd.name = "park";
		smd.m1();
		
		
		
		
		
		
		
		
		
		
		
	}
}

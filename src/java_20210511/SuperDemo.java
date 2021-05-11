package java_20210511;

class A{
	int a;
	A(){}	//super(); 가 암묵적으로 만들어져있다.
	A(int a){
		this.a = a;
	}		//생성자를 만들면 default 생성자를 명시적으로 만들어야 한다.
}

class B extends A{
	B(){
		super(100);
	}//참조하면 부모의 default 생성자를 만들 필요없다.
}

public class SuperDemo {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
	}
}

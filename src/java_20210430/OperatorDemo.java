package java_20210430;

public class OperatorDemo {

	public static void main(String[] args) {

		int a = 10, b = 22;
		int c = 0;
		double d = 0.0;
		
		c = a+b;
		System.out.println(c);
		
		c = a-b;
		System.out.println(c);
		
		c = a*b;
		System.out.println(c);
		
		c = b/a;
		System.out.println(c);
		
		c = b%a;
		System.out.println(c);
	
		d = (double)b/a;
		System.out.println(d);
		
		if(a%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		//복합대입 연산자
		
		a += b; // a = a + b;
		System.out.println(a);
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		a = 0;
		b = 0;
		
		a++;
		++b;
		System.out.println(a +" "+b);
		
		a = 10;
		//대입후 증가
		c = a++;
		System.out.println(c);
		
		a = 10;
		//증가후 대입
		c = ++a;
		System.out.println(c);
		
		//비교연산자
		a = 10;
		b = 20;
		
		boolean isSuccess = a>b ;
		System.out.println(isSuccess);
		
		System.out.println(a>b ? true:false);
		
		if(a>b) {
			System.out.println("a is more bigger than b");
		}
		else {
			System.out.println("b is more bigger than a");			
		}
		
		d = 10.0;
		isSuccess = a==d ;
		System.out.println(isSuccess);
		System.out.println(a==d ? true:false);
		
		
		//논리연산자
		a = 10; b = 20;
		//a && b -> a가 false면 b를 연산하지 않음.(short circuit 발생)
		//a || b -> a가 true면 b를 연산하지 않음. (short circuit 발생)
		isSuccess = (a == b) && (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a+" "+b);
		
		isSuccess =  (++a == b++) && (true);
		System.out.println(isSuccess);
		System.out.println(a+" "+b);
		
		isSuccess = (++a == b++)||(true);
		System.out.println(isSuccess);
		
		
		
		
	}

}

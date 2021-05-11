package java_20210429;

public class LiteralDemo {

	public static void main(String[] args) {
		
		/*
		byte 범위를 넘어가면 컴파일 에러 발생
		byte b1 = 128;			-->int나 short로 바꿔줘야 한다
		정수형 리터럴(byte , short , int)은 2진수, 8진수, 10진수 , 16진수가 있음.
		*/
		
		int a1 = 128;	//10진수 표기법
		int a2 = 076;	//8진수 표기법
		int a3 = 0x123;	//16진수 표기법
		int a4 = 0b1110;//2진수 표기법
		
		System.out.println(a1 +" "+ a2+ " " + a3 + " " + a4);
		
		//long 리터럴은 숫자뒤에 L이나 l로 표기함
		long a5 = 220000000000000L;
		System.out.println("긴 숫자 : " +a5);
		
		//10진수를 표기할 때 3자리 단위로 '_'를 사용할 수 있음.
		int a6 = 1_100_100;
		System.out.println("끊어 사용하기 : " +a6);
		
		//float 리터럴은 소수점 뒤에 F나 f로 표기함
		float a7 = 0.3813812F;
		System.out.println("소수점 : " +a7);
		
		//double 리터럴은 소수점 뒤에 D나 d로 표기함
		double a8 = 12478.123123D;
		System.out.println("큰 소수점 : " +a8);
		
		//boolean 리터럴은 true 나 false
		boolean isExited = false;
		System.out.println("진짜인가 사실인가 : " +isExited);
	}

}

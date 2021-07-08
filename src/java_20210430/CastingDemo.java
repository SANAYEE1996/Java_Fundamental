package java_20210430;

public class CastingDemo {

	public static void main(String[] args) {
		
		/*
		overflow 발생하여 컴파일 에러
		byte b1 = 129;
		*/
		
		//circuit 발생 , 권장하지 않음. 
		byte b1 = (byte)129;
		System.out.println(b1);
		
		//cut 발생 
		int i1 = (int) 129.98;
		System.out.println(i1);
		//auto-casting 자동 형변환 발생
		double d1 = 124.56f;
		System.out.println(d1);
		
		byte b3 = 20, b2 = 30;
		/*
		산술연산자 '+'의 반환값은 int
		byte b4 = b2 + b3;
		*/
		int b4 = b2 + b3;
		byte b5 = (byte)(b2 + b3);
		System.out.println((byte)(b3+b2) +" "+b4 + " " +b5 );
		
		//연결연산자
		//1. 문자열 + 숫자 = 문자열
		//2. 순자 + 문자열 = 문자열
		//3. 문자열 + 문자열 = 문자열
		String str1 = "Park" +1+2;
		String str2 = 1+2+"Park";
		
		System.out.println(str1 + " " +str2);
		
		
	}
}

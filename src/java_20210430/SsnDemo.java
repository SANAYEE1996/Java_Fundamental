package java_20210430;

public class SsnDemo {
	public static void main(String args[]) {
		int a1 = 1,a2 = 1,a3 = 1,a4 = 1,a5 = 1,a6 = 1;
		
		int b1 = 1,b2 = 1,b3 = 1,b4 = 1,b5 = 1,b6 = 1,b7 = 8;
		
		a1 *= 2;
		a2 *= 3;
		a3 *= 4;
		a4 *= 5;
		a5 *= 6;
		a6 *= 7; 
		b1 *= 8;
		b2 *= 9;
		b3 *= 2;
		b4 *= 3;
		b5 *= 4;
		b6 *= 5;
		int sum = 0;
		sum = a1 + a2 + a3 + a4 + a5 + a6 + b1 + b2 + b3 + b4 +b5 +b6;
		
		int rest = 0; 
		rest = sum%11;
		rest = 11- rest;
		rest %= 10;
		if(rest == b7) {
			System.out.println("정상");
		}
		else {
			System.out.println("비정상");
		}
		
	}
}

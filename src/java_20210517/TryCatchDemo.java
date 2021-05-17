package java_20210517;

import java.util.Arrays;

public class TryCatchDemo {
	public static double getAvgs(int a, int b) {
		return (double) (a + b) / 2;
	}

	// javac TryCatchDemo.java -> compile 하는 방법
	// java TryCatchDemo.java 10 20 30 -> 10,20,30이 배열로 입력되어 실행 됨.
	// Run configurations -> arguments에 값을 넣으면 실행 됨.

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);//a가 들어가면 : NumerFormatException
													//아무것도 안넣으면 : ArrayIndexOutOfBoundsException
		
			System.out.println("국어 점수 : "+korean + "\n영어 점수 : "+english+"\n전체 점수 : "+Arrays.toString(args));
			System.out.println("국어와 영어의 평균 점수는 : "+getAvgs(korean,english));
		}catch(NumberFormatException e) {
			//catch 블럭의 수행문을 만들 때 2가지 형태로 코딩한다.
			//1.개발자한테 보일 목적의 에러 메세지를 출력 - 개발 단계에서 설정
			e.printStackTrace();
			//1-1.에러메세지만 보여줌.
			System.out.println(e.getMessage());
			//1-2.빨간 색깔의 에러메세지를 보여줌
			System.err.println(e.getMessage());
			//2.사용자한테 보일 목적의 에러 메세지를 출력 - 서비스 단계에서 설정
			System.out.println("형식을 지켜라");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//1.개발자한테 보일 목적의 에러 메세지를 출력
			e.printStackTrace();
			//1-1.에러메세지만 보여줌.
			System.out.println(e.getMessage());
			//1-2.빨간 색깔의 에러메세지를 보여줌
			System.err.println(e.getMessage());
			//2.사용자한테 보일 목적의 에러 메세지를 출력
			System.out.println("범위를 지켜라");
		}finally {
			System.out.println("무조건 수행 되는 블럭 - finally");
		}
		
	}
}

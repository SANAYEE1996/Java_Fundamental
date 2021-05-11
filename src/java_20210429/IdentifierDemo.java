//패키지명도 식별자에 포함되기 때문에 식별자 규칙을 지켜야 한다.
package java_20210429;
//클래스명도 식별자에 포함됨
//클래스명의 첫글자는 대문자로, 두 단어가 합쳐진 경우에는 두번째 단어의 첫글자도 대문자
public class IdentifierDemo {
	//메서드명도 식별자에 포함됨
	//클래스명을 제외한 모든 이름은 소문자로 시작한다.
	public static void main(String args[]) {
		int age = 20;
		String name = "Hello!";
		
		/*
		첫글자는 숫자를 사용할 수 없음.
		String 1father = "John"; 			--> 사용불가
		
		공백을 사용할 수 없음.
		String mother Name = "Michell";		--> 사용불가
		
		예약어를 사용할 수 없음.
		String void = "Empty";				--> 사용불가
		
		자바는 유니코드를 기본적으로 지원하기 때문에
		한글도 식별자로 사용가능하지만 안쓰는게 좋음
		String 이름 = "김이박";					--> 사용가능하긴 함
		*/
		
		int a = 0xFFFFFF;
		int b = 0x0000;
		System.out.println("your age is " +age);
		System.out.println("your name is " +name);
		System.out.println("16진수 범위 : "+b+" ~ "+a);
		
	}
	
	
}

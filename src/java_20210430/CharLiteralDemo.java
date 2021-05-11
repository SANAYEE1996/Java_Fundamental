package java_20210430;

public class CharLiteralDemo {

	public static void main(String[] args) {
		char c1 = '박';
		char c2 = '영';
		char c3 = '상';
			
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//char 리터럴 -> 유니코드 표현법
		char c4 = '\ubc15';
		char c5 = '\uc601';
		char c6 = '\uc0c1';
		
		System.out.println(c4 + "" +c5+ "" +c6);
		
		//char 리터럴 -> 아스키코드 표현법
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7 +"" +c8 + "" +c9);
		
		//문자중에 사용할 수 없는 문자는 ',\
		//사용하기 위해서는 \(역슬래시)를 사용해야 한다.
		char c10 = '\'';
		char c11 = '\\';
		
		System.out.println(c10 +"" +c11);
		
		//String path = "C:\\Users\\user";
		
		//특수문자 \t \n
		
		System.out.print("안녕하세요. \n저는 박영상. \nnice to meet you\n");
		
		System.out.println("아이디\tname\t\tarea");
		System.out.println("ysp0826\tparkyoungsang\tseoul");
		
		
		
	}

}

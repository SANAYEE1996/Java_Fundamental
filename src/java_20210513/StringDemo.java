package java_20210513;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		char[] c = {'h','e','l','l','o'};
		String str = new String(c);
		//문자열 중에 특정 문자 하나만 반환하는 메서드
		//index는 0부터 시작
		System.out.println(str);
		
		char c1 = str.charAt(3);
		System.out.println(c1);
		
		//문자열 연결하는 메서드
		str = str.concat("123");
		System.out.println(str);
		
		
		str = "abc.zip";
		if(str.endsWith("zip")) 
			System.out.println("압축파일 입니다");
		else if(str.endsWith("doc")) 
			System.out.println("워드문서 입니다");
		else 
			System.out.println("파일입니다.");
		
		String url = "https://www.naver.com";
		String path = "/news/board.do?id=123&cat=1";
		//startWith(String msg) => msg 문자열을 시작하면 true
		//시작 안하면 false
		if(path.startsWith("/news"))
			System.out.println("뉴스 페이지 입니다");
		else if(path.startsWith("/sports"))
			System.out.println("스포츠 페이지 입니다");
		else
			System.out.println("페이지가 존재하지 않습니다");
		//equals() -> 문자열 비교
		//equalsIgnoreCase() -> 대소문자 구분하지 않고 비교
		//trim() => 앞뒤 공백 제거
		String m1 = " hello ".trim();
		String m2 = "HeLlO";
		if(m1.equalsIgnoreCase(m2)) 
			System.out.println("true");
		else 
			System.out.println("false");
		
		String m3 = "안녕하세요.";
		byte[] b = m3.getBytes();
		System.out.println(Arrays.toString(b));
		
		String m4 = new String("111111-1111118");
		int index = m4.indexOf("-");
		System.out.println(index);
		
		String m5 = "a.b.c.d.zip";
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);
		
		
		String m6 = "010-3024-9999";
		
		String[] st = m6.split("-");
		System.out.println(Arrays.toString(st));
		
		int al = Integer.parseInt(m4.substring(0,1));
		
		System.out.println(m6.replaceAll("-", "   *   "));
		
		System.out.println(m2.toUpperCase());
		System.out.println(m2.toLowerCase());
		
		double d = 12345678.34545789123;
		String m7 = String.format("%,.10f", d);
		
		System.out.println(m7);
		System.out.format("%s",String.format("%,.4f", d));
		
	}

}

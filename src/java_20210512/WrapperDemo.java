package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		//ctrl + shift + o => auto import
		//자바 1.4 이전 버전에서는 primitive data type을 Collection에
		//저장할 수 없었기 때문에 primitive data type을 객체화 할 수 있는
		//Wrapper Class로 변환하여 저장해야 했다.
		//아래와 같이 1을 저장 할 수 없음.		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(Integer.valueOf(1));
		
		//1.primitive data type => wrapper class로 변환(생성자 이용)
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("100");
		
		//2. wrapper class -> primitive data type (intValue)
		int i3 = i1.intValue() + i2.intValue();
		
		//3. 숫자로 구성된 String -> primitive data type
		//	Integer.parseInt("10");
		String a = "12345";
		int i4 = Integer.parseInt(a);
		
		//4. auto-boxing : primitive data type -> wrapper Clss
		Integer i5 = 10;
		Integer i6 = 200;
		//5. auto-unboxing : wrapper Class - > primitive data type
		int i9 = i6+i5;
		
	}

}

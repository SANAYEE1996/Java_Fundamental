package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//java.lang.NumberFormatException -> 예외 처리를 해야한다.
		int i = Integer.parseInt("1111a");	//1111a -> 예외처리를 해야함
		int j = Integer.parseInt("36.17");	//36.17 -> 코드를 변경해야함
		System.out.println(i+" "+j);
		
		double d = Double.parseDouble("12.34");
		System.out.println(d);
		
		
		//java.lang.ArrayIndexOutOfBoundsException
		//배열의 범위를 벗어나면 발생하는 예외
		int[] a = {1,2};
		System.out.println(a[4]);
		
		//java.lang.IndexOutOfBoundsException
		//Collection 에서 범위를 벗어나면 발생하는 예외 
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123); //auto - boxing
		System.out.println(list.get(1));
		
		
		//java.lang.NullPointerException
		//객체를 생성하지 않고 메서드를 사용하면 발생하는 예외
		String str = null;
		System.out.println(str.length());
		
		//java.lang.ArithmeticException
		//산술 과정에서 발생하는 예외
		int a1 = 10, b1 = 0;
		System.out.println(a1/b1);
		
		
	}

}

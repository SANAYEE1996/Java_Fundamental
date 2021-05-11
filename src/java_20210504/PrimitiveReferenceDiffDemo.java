package java_20210504;

import java.util.Arrays;

public class PrimitiveReferenceDiffDemo {

	public static void main(String[] args) {
		
		int a = 10;
		//primitive 변수를 할당하면 값이 할당됨.
		int b = a;
		b = 30;
		System.out.println(a + " " +b);
		
		int[] test = {10,20,30,40};
		//reference 변수를 할당하면 같은 객체를 참조함.
		int[] temp = test;

		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(temp));
		
		temp[2] = 3000;
		
		System.out.println(Arrays.toString(temp));
		if(test == temp) System.out.println("Same");
	}
}

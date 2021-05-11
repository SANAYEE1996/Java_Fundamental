package java_20210507;

import java.util.Arrays;

public class MethodDemo {
	
	public void print(int year, int month){
		
		System.out.println("일 	월	화	수	목	금	토");
		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeafYear = isLeafYear(year);
		if(isLeafYear) arr[1] = 29;
		for(int i = 1; i <= arr[month-1];i++) {
			System.out.print(i+"	");
			if(i %7 ==0) System.out.println();
		}
	}
	
	public int[] ascending(int[] array) {
		for(int i=0; i < array.length; i++) {
			for(int j = 0; j < array.length -(i+1); j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}		
		return array;
	}
	
	public boolean isLeafYear(int year) {
		return (year%4 == 0 && year%100 != 0) || year%400 == 0;
	}

	public int plus(int first, int second) { 
		//first, second => 매개변수(parameter)
		return first*second;
	}
	
	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		int sum = m.plus(10,20);	//10,20 => 인자(arguments)
		
		System.out.println(sum);
		
		System.out.println(m.isLeafYear(1984));
		
		
		int[] test = {30,48,47,29,49,18,238,9,3,18,94,37,39,100};
		System.out.println(Arrays.toString(m.ascending(test)));
		
		m.print(2017, 2);
		
	}

}

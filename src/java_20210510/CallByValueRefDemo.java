package java_20210510;

import java.util.Arrays;

public class CallByValueRefDemo {
	
	public static void ascending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length -(i+1); j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void change(int i ,int[] j) {
		i = 20;
		j[3] = 400;
	}
	
	public static void main(String[] args) {
		
		int i = 10;
		int[] j = {1,2,3,4};
		System.out.println(i +" "+j[3]);
		change(i,j);
		System.out.println(i +" "+j[3]);
		
		int[] lotto = {3,5,1,8,19,42,3,1,13};
		ascending(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
	}

}

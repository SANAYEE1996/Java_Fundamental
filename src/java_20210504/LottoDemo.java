package java_20210504;

import java.util.Arrays;

public class LottoDemo {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		Lot(lotto);
		System.out.println(Arrays.toString(lotto));

	}
	
	private static int[] Lot(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		return arr;
	}

}

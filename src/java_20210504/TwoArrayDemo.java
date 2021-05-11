package java_20210504;

public class TwoArrayDemo {

	public static void main(String[] args) {
		
		//2차원 배열의 선언과 생성
		int[][] a = new int[3][2];
		
		//2차원 배열의 할당
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		
		int[][] b = {{10,20},{30,40},{50,60}};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] temp = {10,20,30,40,50};
		System.out.println();
		for(int value : temp) {
			System.out.print(value +" ");
		}
		System.out.println();
		String[] fruits = {"banana","apple","melon"};
		
		for(String value : fruits) {
			System.out.print(value +" ");
		}

	}

}

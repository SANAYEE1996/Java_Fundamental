package java_20210504;

public class ArrayDemo {
	public static void main(String args[]) {
		
		//배열 선언, 생성
		int[] a = new int[4];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		for(int i = 0; i <4; i++) {
			int temp = a[i];
			System.out.println(temp);
		}
		
		int[] b = {100,200,300,400};
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum = 15;
		for(int i = 0; i <8; i++) {
			sum += monthArray[i];
		}
		System.out.println("the answer is "+sum);
		
	}
}

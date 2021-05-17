package java_20210517;

public class ThrowsDemo2 {

	private static double getAverage(int[] arr) throws ArrayIndexOutOfBoundsException{
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		return (double) sum/arr.length;
	}
	
	public static void main(String[] args) {
		int[] exam = {10,20,35};
		try {
			System.out.printf("평균 점수 : %.3f",getAverage(exam));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("N개의 배열을 입력해야 합니다.");
		}
		
		
		
	}

}

package java_20210503;
 
public class ContinueDemo {
	public static void main(String args[]) {
	
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			if(i == 6) 
				continue;
			sum += i;
		}
		System.out.println("합은 : "+sum);
		
		for(int i = 10; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			for(int k = 0; k <= 10-i; k++) {
				System.out.print(" ");
			}
		}
		System.out.println();
		int cnt = 0;
		int k = 1;
		int c = 9;
		while(true) {
			for(int j = 0; j < c; j++) {
				System.out.print(" ");
			}
			c--;
			
			for(int i = 1; i <= k; i++) {
				System.out.print("*");
			}
			k += 2;
			
			cnt++;
			System.out.println();
			if(cnt == 10) break;
		}
		
	}

}

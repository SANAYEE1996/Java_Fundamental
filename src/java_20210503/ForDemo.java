package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		
		System.out.println("1 to 10 even sum : " +sum);
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i+" 단 입니다.");
			for(int j = 1; j <=9; j++) {
				System.out.print(i+" X "+j+" = "+i*j + "	");
				if(j % 3==0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		
		for(int i = 1; i <= 100; i++) {
			int count = 0;
			
			for(int j = 2; j <= i ; j++) {
				if(i %j ==0) {
					count++;
					break;
				}
				totalIndex++;
			}
			if(count == 2) {
				totalCountOfPrimeNumber++;
				System.out.print(i);			
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
		int n = 1000;
		int cnt = 2;
		int banbok = 0;
		for(int i = 4; i <= n; i++) {
			banbok++;
			for(int j = 2; j <= Math.sqrt(i); j++ ) {
				banbok++;
				if(i%j == 0) {
					break;
				}
				else if(j == (int)Math.sqrt(i)) {
					cnt++;
				}
			}
		}
		System.out.println();
		System.out.println(cnt);
		System.out.println(banbok);
		
	}

}

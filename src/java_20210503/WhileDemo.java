package java_20210503;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			i++;		
		}
		System.out.println(sum);
		i = 2;
		int j = 1;
		while(i <= 9) {
			System.out.print(i+" X "+j+" = "+i*j + "	");
			if(j%3==0) {
				System.out.println();
			}
			j++;
			if(j == 10) {
				i++;
				j = 1;
				System.out.println();
			}
		}
		
		
		
	}

}

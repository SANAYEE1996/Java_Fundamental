package java_20210430;

public class IfDemo {

	public static void main(String[] args) {
		
		//Run configurations -> arguments -> program arguments
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else
			season = "없는 겨울";

		System.out.println(month+"월은 " + season + "입니다.");
		
		int a = 125890;
		double d = 12345.6788;
		String name = "parkYS";
		
		System.out.printf("a : %10d \n",a);
		System.out.printf("d : %f \n",d);
		System.out.printf("name : %s \n",name);
		
		int a1= 100;
		String msg = "";
		if(a1 %2 == 0) {
			msg = "짝수";
		}
		else {
			msg = "홀수";
		}
		System.out.println(msg);
		msg = a1%2 ==0 ? "짝수" : "홀수";
		
		System.out.println(msg);
		
		
	}

}

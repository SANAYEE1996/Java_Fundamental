package java_20210504;

public class CalenderDemo {

	public static void main(String[] args) {


		String answer = "";

		int yy = 2000;
		int mm = 2;
		int dd = 1;
		int sum = 0;

		sum = (yy - 1) * 365 + yy / 4 - yy / 100 + yy / 400;
		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		if ((yy%4 == 0 && yy%100 != 0)||yy%400 == 0) {
			if (mm == 1) {
				sum += dd -1;
			}
			else if(mm == 2) {
				sum += dd + arr[0] -1;
			}
			else {
				for (int i = 0; i < mm-1; i++) {
					sum += arr[i];
				}
				sum+= dd;
			}
		} 
		else {
			if (mm == 1) {
				sum += dd;
			}
			else {
				for (int i = 0; i < mm-1; i++) {
					sum += arr[i];
				}
				sum += dd;
			}
		}

		if (sum % 7 == 1) {
			answer = "월";
		} else if (sum % 7 == 2) {
			answer = "화";
		} else if (sum % 7 == 3) {
			answer = "수";
		} else if (sum % 7 == 4) {
			answer = "목";
		} else if (sum % 7 == 5) {
			answer = "금";
		} else if (sum % 7 == 6) {
			answer = "토";
		} else if (sum % 7 == 0) {
			answer = "일";
		}

		System.out.println("the ansewer is " + answer);

	}

}

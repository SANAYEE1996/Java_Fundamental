package java_20210507;

public class Calendar {
	private int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	private boolean isLeafYear(int year) {
		return year%4 == 0 && year%100 != 0||year%400 == 0;
	}
	
	public void print(int year, int month, int day) {
		String answer = "";

		int sum = 0;

		sum = (year - 1) * 365 + year / 4 - year / 100 + year / 400;
		
		
		if (isLeafYear(year)) {
			monthArray[1] = 29;
			if (month == 1) {
				sum += day-1;
			}
			else {
				for (int i = 0; i < month-1; i++) {
					sum += monthArray[i];
				}
				sum+= day-1;
			}
		} 
		else {
			if (month == 1) {
				sum += day;
			}
			else {
				for (int i = 0; i < month-1; i++) {
					sum += monthArray[i];
				}
				sum += day;
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

		System.out.println("요일은 : " + answer);
	}

	public void print(int year, int month) {
		System.out.println();
		System.out.println(year+" 년 " +month +"달력입니다");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		if(isLeafYear(year)) {
			monthArray[1] = 29;
		}
		
		//탭 만큼 띄어쓰기 해야 한다. ex) 2021년 5월 달력을 출력하기 위해서는
		//2021년 5월 1일까지 총 날짜를 구해서 7로 나눈 나머지를 구해야한다.
		int c = firstday(year, month);
		
		for(int j = 0; j < c; j++) {
			System.out.print("\t");
		}
		for(int i = 1; i <= monthArray[month-1]; i++) {
			System.out.print(i + "\t");
			if((i+c) % 7 ==0) System.out.println();
		}
		
		System.out.println();
	}

	public void print(int year) {
		for(int i = 1; i <= 12; i++) {
			print(year,i);
		}
	}
	
	public int firstday(int year,int month) {
		int sum = (year - 1) * 365 + year / 4 - year / 100 + year / 400;
		
		if (isLeafYear(year)) {
			monthArray[1] = 29;
			if(month != 1){
				for (int i = 0; i < month-1; i++) {
					sum += monthArray[i];
				}
			}
		} 
		else {
			if(month != 1) {
				for (int i = 0; i < month-1; i++) {
					sum += monthArray[i];
				}
			}
		}
		return sum % 7;
	}


}

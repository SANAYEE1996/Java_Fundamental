package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(year + "년 "+ (month+1)+ "월 "+day+"일 "+hour+"시 "+min+"분 "+sec+"초");
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer mes = new StringBuffer();
		if(dayOfWeek == Calendar.SUNDAY) mes.append("일요일");
		else if(dayOfWeek == Calendar.MONDAY) mes.append("월요일");
		else if(dayOfWeek == Calendar.TUESDAY) mes.append("화요일");
		else if(dayOfWeek == Calendar.WEDNESDAY) mes.append("수요일");
		else if(dayOfWeek == Calendar.THURSDAY) mes.append("목요일");
		else if(dayOfWeek == Calendar.FRIDAY) mes.append("금요일");
		else if(dayOfWeek == Calendar.SATURDAY) mes.append("토요일");
		
		System.out.println(year + "년 "+ (month+1)+ "월 "+day+"일 "+mes.toString()+"입니다.");
		
		cal.set(1900,1,13);//날짜 변경
		//ctrl + shift + o => auto import
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 E요일");
		
		Date d = cal.getTime();
		String dis = sdf.format(d);
		System.out.println(dis);
		//해당 월의 마지막 날짜를 반환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
		
		
		
	}

}

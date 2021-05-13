package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음.
		
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 
		//natural ordering을 한다.
		//natural ordering(숫자일때와 문자일 때 정렬방식이 다름)을 한다.
		TreeSet<String> set = new TreeSet<String>();
		set.add("1");
		set.add("2");
		set.add("24");
		set.add("23");
		set.add("6531");
		set.add("21");
		set.add("4121");
		set.add("14");
		set.add("11");
		
		//HashSet 클래스는 자체적으로 출력할 방법이 없음.
		//HashSet을 Iterator로 변환해서 출력해야 함.
		
		Iterator<String> i = set.iterator();
		
		//hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		//있으면 true, 없으면 false
		
		while(i.hasNext()) {
			String temp = (String)i.next();
			System.out.println(temp);
		}
		
		TreeSet<Integer> lottoset = new TreeSet<>();
		
		while(true) {
			lottoset.add((int)(Math.random()*45 +1));
			if(lottoset.size() == 6) break;
		}
		
		Iterator<Integer> ii = lottoset.iterator();
		while(ii.hasNext()) {
			Integer temp = (Integer)ii.next();
			System.out.print(temp+" ");
		}
		
	}

}

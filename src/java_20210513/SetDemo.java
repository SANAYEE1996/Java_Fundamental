package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음.
		
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 
		//natural ordering을 한다.
		//natural ordering(숫자일때와 문자일 때 정렬방식이 다름)을 한다.
		//TreeSet<String> set = new TreeSet<String>();
		//TreeSet은 중복을 허용하지 않을때 equals가 아니라 compareTo를 쓴다.
		//CompareTo는 객체의 같은지 여부를 판단 할 수 있다.	
		//LinkedHashSet 클래스는 데이터의 중복을 허용하지 않고
		//순서는 FIFO 넣은 순서대로 출력
		LinkedHashSet<String> se = new LinkedHashSet<>();
		se.add("1");
		se.add("2");
		se.add("24");
		se.add("23");
		se.add("6531");
		se.add("21");
		se.add("4121");
		se.add("14");
		se.add("11");
		
		//HashSet 클래스는 자체적으로 출력할 방법이 없음.
		//HashSet을 Iterator로 변환해서 출력해야 함.
		
		Iterator<String> i = se.iterator();
		
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
		
		StringBuffer s = new StringBuffer("a");
		StringBuffer s1 = new StringBuffer("a");
		//HashSet 클래스는 데이터의 중복을 판단할 때 equals()로 비교해서
		//true가 나오면 데이터가 중복되었다고 판단하여 
		//데이터를 추가해 주지 않음.
		HashSet<StringBuffer> set1 = new HashSet<>();
		set1.add(s);
		set1.add(s1);
		
		System.out.println("\nset1 size "+set1.size());
		
		//HashSet 클래스는 데이터의 중복을 판단할 때 comparTo()로 비교하며
		//객체안의 문자열에 대해 동일 유무를 판단할 수 있어 
		//같으면 true가 나와 0을 반환하고 데이터를 추가해 주지 않음.
		
		System.out.println(s.compareTo(s1));
		
		TreeSet<StringBuffer> set2 = new TreeSet<>();
		set2.add(s);
		set2.add(s1);
		
		System.out.println("set2 size "+set2.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

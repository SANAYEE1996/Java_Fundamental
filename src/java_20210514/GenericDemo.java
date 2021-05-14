package java_20210514;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(1049);
		
		for(Integer temp : list) {
			System.out.println(temp);
		}
	}

}

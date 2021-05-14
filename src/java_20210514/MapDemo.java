package java_20210514;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap : key값은 유일해야 하고 , value는 객체의 중복을 허용함
		HashMap<String,String> map = new HashMap<>();
		map.put("a", "100");
		map.put("b", "200");
		map.put("c", "300");
		
		String value1 = map.get("a");
		String value2 = map.get("b");
		String value3 = map.get("c");
		
		System.out.println(value1 + " "+value2+" "+value3);
		
		Set<String> keyset = map.keySet();
		
		Iterator<String> i = keyset.iterator();
		while(i.hasNext()) {
			String key = (String) i.next();
			String val = (String) map.get(key);
			System.out.println(key +" "+ val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

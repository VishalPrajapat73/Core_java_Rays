package in.co.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main (String [] args) {
		
		Map m  = new HashMap();
		m.put( 1 ,  " Vishal ");
		m.put( 2 ,  " VK ");
		m.put( 3 ,  " Prajapat ");
		
		System.out.println(m);
		for(Object obj : m.entrySet()) {
			Map.Entry entry = (Map.Entry)obj;
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " " + value);
		}
		System.out.println(m.get(3));
	}
}

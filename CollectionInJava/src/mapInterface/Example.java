package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(1,"Banana");
		map.put(2,"Grapes");
		map.put(3,"Apple");
		map.put(4,"Orange");
		map.put(2,"Fig");
		map.put(5,"Grapes");
		
		System.out.println(map);
		
		map.remove(5);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println(map.get(3));
		
	}

}

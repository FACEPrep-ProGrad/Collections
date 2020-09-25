package SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Grapes");
		set.add("Orange");
		set.add("Fig");
		set.add("Banana");
		//set.add(null);
		set.add("Grapes");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

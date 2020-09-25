package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Example {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("ProGrad");
		list.add("Object");
		list.add("ProGrad");
				
		System.out.println(list);

//		Collections.sort(list);
		
		System.out.println(list);
		
		list.remove("Jerry");
		
		System.out.println(list.contains("ProGrad"));
		
		list.clear();
		
		System.out.println(list);

		
	}

}

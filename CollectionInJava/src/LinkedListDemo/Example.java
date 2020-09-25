package LinkedListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("ProGrad");
		list.add("Object");
		list.add(1,"Tom");
		list.set(1, "Jerry");
		
		System.out.println(list);

		Collections.sort(list);
		
		System.out.println(list);
		
		list.remove("Jerry");
		
		System.out.println(list.contains("ProGrad"));
		
		list.clear();
		
		System.out.println(list);


	}

}

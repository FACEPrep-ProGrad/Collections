package LinkedListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		System.out.println("Enter values");
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			list.add(num);
		}
				
		System.out.println("For Loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Advanced For loop");
		for(Integer num: list) {
			System.out.println(num);
		}
		
		System.out.println("While loop");
		int i=0;
		while(list.size()>i) {
			System.out.println(list.get(i));
			i++;
		}
		
		System.out.println("Iterator");
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}

package ListExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String name;
		int age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Employee[] emp = new Employee[n];
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		
		for(int i = 0;i<n;i++) {
			name = br.readLine();
			age = Integer.parseInt(br.readLine());
			emp[i] = new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			list.add(emp[i]);
		}
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e.getName()+" "+e.getAge());
		}
	}

}

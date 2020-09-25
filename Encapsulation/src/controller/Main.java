package controller;

import Model.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		obj.setSsn(1);
		obj.setName("ProGrad");
		obj.setAge(25);
		
		System.out.println(obj.getSsn());
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
	

}


public class NullPointerException {

	public static void main(String[] args) {
		
		//Array of objects
		Student[] obj = new Student[5];
		
		//Intialize each and every arry object
		//obj[0] = new Student();
		
		obj[0].age = 20;
		obj[0].name = "ProGrad";

	}

}

class Student{
	int age;
	String name;
}

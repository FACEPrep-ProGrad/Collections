
public class ConstructorDemo {
	
	String name;
	int id;
	
	ConstructorDemo(int identity, String name){
		this.name = name;
		this.id = identity;
	}
	
	void display() {
		System.out.println("Id "+id+"\n"+"Name: "+name);
	}
	//this keyword represents current class object
	
	//this contains the address of the object through which the function is invoked

	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo(1,"ProGrad");
		
		ConstructorDemo obj1 = new ConstructorDemo(2,"ProGrad");
		
		obj.display();
		
		obj1.display();
	}

}

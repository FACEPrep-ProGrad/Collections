package CompileTime;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b, int c) {
		return a+b+c;
	}

	public float add(int a,float b) {
		return a+b;
	}
	
	public float add(float a,int b) {
		return a+b;
	}

	public float add(float a,float b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		float a = (float) 10.0;
		int b = 10;
		
		System.out.println(cl.add((float)10.0, b));
		System.out.println(cl.add(a, a));
		System.out.println(cl.add(b, b));
		System.out.println(cl.add(b, b, b));
		System.out.println(cl.add(b, a));
		
		

	}

}

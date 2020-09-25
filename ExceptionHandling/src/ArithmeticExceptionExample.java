
public class ArithmeticExceptionExample {

	public int division(int a, int b) throws ArithmeticException{
		int t = a/b;
		return t;
	}
	
	public static void main(String[] args) {
		
		ArithmeticExceptionExample obj =  new ArithmeticExceptionExample();
		
//		try {
		 
		 System.out.print(obj.division(10, 0));
//		}
//		catch(Exception e) {
//			System.out.println(e);
//			System.out.println("An Exception Occured!");
//		}
//		finally {
//			System.out.println("Finally!");
//		}
	}

}

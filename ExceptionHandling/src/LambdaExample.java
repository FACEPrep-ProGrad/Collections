interface Main{
	
	double getValue(int n);
	
}


public class LambdaExample {

	public static void main(String[] args) {
		
		Main ref;
		
		ref =(a)->{
			return a+10;
		};
		
		System.out.println(ref.getValue(10));

	}

}

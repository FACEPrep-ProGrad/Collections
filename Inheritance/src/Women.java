
public class Women extends Human{

	private String color;
	
	public Women(boolean vegetarian, int height, int weight) {
		super(vegetarian, height, weight);
		
		this.color = "white";
	}
	
	public Women(boolean vegetarian, int height, int weight,String color) {
		super(vegetarian, height, weight);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

//upcasting -> When you create an object for sub-class, and assign it to a super class varibale

//Women women = new Women();

//Human obj = women;




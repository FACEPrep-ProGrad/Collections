
public class Human {
	private boolean vegetarian;
	private int height;
	private int weight;
	
	public Human(boolean vegetarian, int height, int weight) {
		this.vegetarian = vegetarian;
		this.height = height;
		this.weight = weight;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}	
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean vegetarian;
		int height, weight;
		String color;
		
		//wrapper classes
		vegetarian = Boolean.parseBoolean(br.readLine());
		height = Integer.parseInt(br.readLine());
		weight = Integer.parseInt(br.readLine());
		color = br.readLine();
		
		Human human = new Human(vegetarian,height,weight);
		
		Women women = new Women(vegetarian,height,weight,color);
		Women women1 = new Women(vegetarian,height,weight);
		
		System.out.println(women.isVegetarian()+" "+ women.getHeight() +" "+women.getWeight()+" "+women.getColor() );
		
		System.out.println(women1.isVegetarian()+" "+ women1.getHeight() +" "+women1.getWeight()+" "+women1.getColor() );
	}

}

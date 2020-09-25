import java.util.Scanner;

public class MultipleObject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MultipleObject obj;
		
		for(int i=0;i<3;i++) {
			String name = sc.nextLine();
			obj = new MultipleObject();
			obj.display(name);
		}

	}
	
	void display(String name) {
		System.out.println(name);
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOfObjects {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String name;
		long salary;
		
		Employee emp[] = new Employee[num];
		for(int i=0;i<num;i++) {
			name = br.readLine();
			salary = Long.parseLong(br.readLine());
			
			emp[i] = new Employee();
			emp[i].setName(name);
			emp[i].setSalary(salary);
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("Name :"+emp[i].getName()+"Salary :"+emp[i].getSalary());
		}
	}

}

class Employee{
	private String name;
	private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
}

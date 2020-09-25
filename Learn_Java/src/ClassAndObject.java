
public class ClassAndObject {
	
	double balance = 0.0; //instance variable
	
	public void deposit(double amount) {
		balance = balance+amount;
	}

	public void withdraw(double amount) {
		int minBalance = 5000;
		if(balance >= (amount+minBalance)) {
			balance = balance - amount;
			System.out.println("You have withdrawed "+amount);
			System.out.println("Available balance "+balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public static void main(String[] args) {
		
		ClassAndObject customer = new ClassAndObject();
		
		customer.deposit(50000);
		
		customer.withdraw(40000);

	}

}

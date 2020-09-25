package multilevelInheritance;

public class Baleno extends Maruti{
	public Baleno() {
		System.out.println("Maruti model: Baleno");
	}
	
	public void speed() {
		System.out.println("Speed: 160kmph");
	}
	
	public static void main(String args[]) {
		Baleno obj = new Baleno();
		obj.vehicleType();
		obj.brand();
		obj.speed();
	}
}

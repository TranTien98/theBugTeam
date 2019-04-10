package polymorphism;

public class Splender extends Bike{
	@Override	// override method run in super class ( bike ).
	void run() {
		System.out.println("running in Splender");
	}
	
	public static void main(String[] args) {
		Bike b = new Splender(); // upcasting
		b.run();
	}
}

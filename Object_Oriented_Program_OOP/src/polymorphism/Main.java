package polymorphism;

public class Main {
	public static void main(String[] args) {
		Bank b;
		b = new TechComBank();
		System.out.println("TeckComBank rate of interest = " + b.getRateOfInterest());
		
		b = new VietinBank();
		System.out.println("VietinBank rate of interest = " + b.getRateOfInterest());
	}
}

package abstraction;

public class Main {
	public static void main(String[] args) {
		Bike bike;
		bike = new Honda();

		bike.run(); // Honda running 60km/h
		bike = new Suzuki();
		bike.run(); // Suzuki running 100km/h
	}
}

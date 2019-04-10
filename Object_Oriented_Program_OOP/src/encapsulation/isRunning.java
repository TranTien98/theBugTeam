package encapsulation;

public class isRunning {
	public static void main(String[] args) {
		Student s = new Student();
//		s.Name = "Tien";	// error
//		s.Address = "Hue";	// error
		s.setName("Tien");
		s.setAddress("Hue");
		
		System.out.println("Name = " + s.getName());
		System.err.println("Address = " + s.getAddress());
	}
}

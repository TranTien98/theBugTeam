package inheritance;

public class Programer extends Employee {
	/*
	 * inheritance can be define as the process where one class acquires the
	 * properties ( method and fields) of another.
	 * 
	 * child class ( derived class ) inherits from the parent class (super class,
	 * base class) and it has properties of parent class keyword: extends class
	 * Super{ properties super class... } class Sub extends Super{ ... }
	 */

	public static void main(String[] args) {
		Programer programer = new Programer();

		programer.setName("Tien"); // super class
		programer.setAddress("Hue"); // super class
		programer.setSalary(1000);

		System.out.println(programer.toString());
	}

	float salary;

	public Programer() {
		super();
	}

	public Programer(float salary) {
		super();
		this.salary = salary;
	}

	public Programer(String name, String address) {
		super(name, address);	// call method contrustor in class Employee
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Programer [salary=" + salary + ", name=" + name + ", address=" + address + "]";
	}
}

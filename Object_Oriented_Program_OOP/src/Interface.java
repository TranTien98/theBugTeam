
public class Interface {
	/*
	 * Interface là kĩ thuật để thu được tính trừu tượng hoàn toàn và đa kế thừa trong java. 
	  - Không thể khởi tạo một interface. 
	  - không chưa bất kì constructor nào.
	  - tất cả các phương thức đều là abstract. 
	  - interface không thể chứa trường nào trừ các trường vừa static và final. 
	  - interface không kế thừa từ lớp, nó được triển khai bởi một lớp (implements) 
	  - một interface có thể kế thừa từ nhiều interface khác ( có thể gọi là đa kế thừa ).
	  - method interface có thể khai triển nếu là static hoặc default.
	 */
	public static void main(String[] args) {
		isImplement implement = new isImplement();
		implement.print();
		implement.show();
		System.out.println("--------------------------");
		isImplement1 implement1 = new isImplement1();
		implement1.print();
		System.out.println("--------------------------");
		isImplement2 implement2 = new isImplement2();
		implement2.print();
		implement2.show();
		
		System.out.println("--------------------------");
		implementInterfaceTest implementInterfaceTest = new implementInterfaceTest();
		implementInterfaceTest.show();
		interfaceTest.print();
	}
}

interface interfaceTest{
	final int isShow = 0; // final fields
	static int isPrint = 1; // static fields
	static final int isTest = 2; // static final fields
	default void show() {
		System.out.println("interfaceTest show method defaut = " + isShow);
	}
	static void print() {
		System.out.println("interfaceTest show method static = " + isPrint);
	}
	
}

class implementInterfaceTest implements interfaceTest{};

interface isInterface {
	void print();
}

interface isInterface1 {
	void print();
}

interface isInterfaceShow {
	void show();
}

interface isInterfaceShow1 extends isInterface {
	void show();
}

class isImplement implements isInterface, isInterfaceShow {

	@Override
	public void print() {
		System.out.println("method print implements interface");
	}

	@Override
	public void show() {
		System.out.println("method show impelemts isInterfaceShow");

	}
}

class isImplement1 implements isInterface, isInterface1 {
	@Override
	public void print() {
		System.out.println("method print implement isInterface and isInterface1");
	}
}

class isImplement2 implements isInterfaceShow1 {
	@Override
	public void print() {
		System.out.println("method print implement isInterfaceShow1 -> test extends");
	}

	@Override
	public void show() {
		System.out.println("method show implement isInterfaceShow1 -> test extends");
	}
}
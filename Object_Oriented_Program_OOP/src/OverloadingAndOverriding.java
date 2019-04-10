
public class OverloadingAndOverriding {
	/*
	 Overloading (nạp chồng):
	 - thực hiện bên trong 1 class.
	 - tham số phải khác nhau (kiểu giá trị có thể giống hoặc khác).
	 - có thể gọi là đa hình lúc biên dịch.
	 - Hàm tạo cũng có thể được nạp chồng.
	 - có thể sử dụng varargs trong trường hợp chưa xác định được tham số nhận vào.
	 -------------------------------------------------------------------
	 Overriding ( ghi đè ):
	 - thực hiện ở 2 class khác nhau có quan hệ kế thừa.
	 - tham số phải giống nhau ( giống về kiểu trả về và tham số).
	 - gọi là đa hình lúc runtime.
	 - Mức truy cập của phương thức ghi đè phương thức ở lớp cha không được nhỏ hơn phương thức đó trong lớp cha.
	 	Ví dụ: phương thức trong lớp cha được khai báo là public thì phương thức ghi đè phương thức đó trong lớp con không thể có phạm vi truy cập là private hoặc protected.
	 - Một phương thức được khai báo là final hoặc static thì phương thức không thể được ghi đè.
	 - Các hàm tạo của lớp cha không thể được ghi đè.
	 */
	
	public static void main(String[] args) {
		System.out.println("overload int 2 tham so = " + Overloading.add(1, 2));		// 3
		System.out.println("overload int 3 tham so = " + Overloading.add(1, 2,3));		// 6
		System.out.println("overload int su dung varargs = " + Overloading.add(1,2,3,4,5,6));// 21
		
		Animal animal = new Dog();
		animal.eat();	// dog eating...
	}
}

class Overloading{
	static int add(int a, int b) {
		return (a + b);
	}
	static double add(double a, double b) {
		return (a+b);
	}
	static int add(int a, int b, int c) {
		return (a+b+c);
	}
	static double add(double a, double b, double c) {
		return (a + b + c);
	}
	
	static int add(int...arr) {
		int res = 0;
		for (int i : arr) {	// foreach
			res += i;
		}
		
		return res;
		
	}
}

class Animal{
	void eat() {
		System.out.println("animal eating...");
	}
}
class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("dog eating...");
	}
}
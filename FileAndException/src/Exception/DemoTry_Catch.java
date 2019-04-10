package Exception;

public class DemoTry_Catch {
	// try...catch dùng để chứa một đoạn code có thể xảy ra ngoại lệ.
	/*
	 trường hợp có nhiều try...catch thì nó chỉ thực hiện 1 ngoại lệ.
	 sắp xếp các ngoại lệ từ cụ thể đến chung ( nhỏ tới lớn).
	 
	 try...catch có thể lồng nhau
	 */
	
	/*
	 finally: mỗi khối try có thể thêm nhiều khối catch nhưng chỉ có thể có 1 khối finally
	 finally sẽ được gọi sau cùng, sử dụng để đóng file, stream,...
	 finally sẽ được thực hiện hầu hết các trường hợp kể cả gọi return trước đó 
	 ( trừ trường hợp gọi system.exit() hoặc xảy ra lỗi khiến chương trình bị chết).
	  
	 */
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
			System.out.println("a[5] = " + a[5]); // lỗi nên thực hiện trong catch
		}catch(ArithmeticException e) {	
			System.out.println("ArithmeticException exception");
//			e.getMessage();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException exception");
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally called");
		}
		
	}
}

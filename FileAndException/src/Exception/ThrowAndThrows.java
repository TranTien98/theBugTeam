package Exception;

public class ThrowAndThrows {
	/*
	 throw:
	 - được sử dụng trong phương thức
	 - ném ra một ngoại lệ
	 - ngoại lệ checked không được truyền ra nếu chỉ sử dụng throw
	 - không thể throw nhiều exceptions
	 
	 ------
	 throws:
	 - được khai báo ngay sau dấu đóng mở ngoặc đơn () của phương thức.
	 - được sử dụng để khai báo một ngoại lệ.
	 - ngoại lệ checked được truyền ngay cả khi chỉ sử dụng throws.
	 - có thể khai báo nhiều exceptions.
	 ví dụ: public void method() throws IOException, Exception
	 */
	public static void main(String[] args) {
		demoThrow.checkAge(10);// exception -> phải xử lí. Try...catch hoặc throws ra ngoại lệ trên main
		demoThrows.checkAge(10);	// ngoại lệ -> try catch hoặc throws tiếp.
	}
	
}

class demoThrow{
	static void checkAge(int age) {
		if(age < 18)
			throw new ArithmeticException("unsatisfactory throw");
		else
			System.out.println("satisfactory");
	}
}

class demoThrows{
	static void checkAge(int age) throws ArithmeticException{
		throw new ArithmeticException("unsatisfactory throws");
	}
	
}

package Exception;

public class CheckedExceptionAndUnchekedException {
	public static void main(String[] args) {
		try {
			CheckedExceptionAndUnchekedException.testMyCheckedException();	// đã được check tại compile-time exception nên bắt phải xử lí
		} catch (MyCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CheckedExceptionAndUnchekedException.testUnCheckedException(); // không được check tại compile-time mà được check tại runtime
	}
	public static void testMyCheckedException() throws MyCheckedException{
		System.out.println("mychecked exception demo");
	}
	public static void testUnCheckedException() throws UnCheckedException{
		System.out.println("UnCheckedException exception demo");
	}
}

class MyCheckedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyCheckedException(String msg) {
		super(msg);
	}
	
}

class UnCheckedException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnCheckedException(String msg) {
		super(msg);
	}
}

// Error là lỗi không thể cứu chữa được, ví dụ: OutOfMemoryError, VirtualMachineError, AssertionError, vv 
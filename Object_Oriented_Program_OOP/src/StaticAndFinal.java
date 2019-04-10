
public class StaticAndFinal {
	/*
	 static:
	 - biến static ( biến tĩnh ):
	 	+ sử dụng để tham chiếu thuộc tính chung của tất cả các đối tượng.
	 	Ví dụ: tên công ti của nhân viên, tên trường học của học sinh.
	 	+ chỉ lấy bộ nhớ trong một lần tải lớp đó ( thuộc class chứ không thuộc object).
	 - phương thức static:
	 	+ thuộc class chứ không thuộc object.
	 	+ có thể gọi mà không cần tạo instance của lớp.
	 	+ có thể truy cập biến static và đổi giá trị của nó.
	 	+ không thể sử dụng các biến non-static hoặc gọi trực tiếp phương thức non-static.
	 	+ không sử dụng từ khóa this và super.
	 	
	 	Question: Vì sao main trong java lại là static?
	 	Answer: Bởi vì không cần thiết phải tạo đối tượng để gọi phương thức static.
	 	Nếu nó là non-static, thì JVM sẽ tạo đối tượng và sau đó gọi phương thức main và có thể gây ra vấn đề về cấp pháp bộ nhớ phụ.
	 	
	 	Question: chúng ta có thể thực thi chương trình mà không có phương thức main không?
	 	Answer:  Có, một trong các cách đó là khối static trong phiên bản trước của JDK. Không phải là JDK 1.7.
	 - khối static: sử dụng để tạo thành viên static.
	 ---------------------------------------------------------
	 final:
	 - biến final ( const): không thể thay đổi giá trị của nó.
	 - phương thức final : không thể ghi đè.
	 - lớp final: không thể kế thừa.
	 
	 Question: phương thức final có kế thừa được không?
	 Answer: Có thể kế thừa (lớp không phải final) nhưng không thể ghi đè (phương thức final).
	 
	 Question: Chúng ta có thể khai báo một constructor final không?
	 Answer: không thể khai báo constructor với từ khóa final trong java.
	 */
}

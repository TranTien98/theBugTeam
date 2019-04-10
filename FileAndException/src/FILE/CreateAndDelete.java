package FILE;

import java.io.File;

public class CreateAndDelete {
	/*
	 Để tạo 1 file thường, thì Java hỗ trợ phương thứ createNewFile.
	 Để tạo thư mục, thì ta có 2 cách:
	 1. public boolean mkdir() : tạo thư mục cho bởi đường dẫn ( chỉ tạo ra nếu thư mục cha tồn tại).
	 2. public boolean mkdirs() : tạo thư mục cho bởi đường dẫn ( bao gồm cả thư mục cha nếu nó không tồn tại).
	 
	 ----
	 Để xóa file, chúng ta có thể sử dụng hàm delete của file để xóa ( trả về true / false)
	 
	 ----
	 Lọc file có nhiều cách để lọc, một trong số đó là sử dụng hàm getAbsolutePath để lấy đường dẫn kết hợp với hàm endWith của String để lọc file cần lấy.
	 ----
	 Ngoài ra còn một số hàm khác hỗ trợ thêm khi thao tác với file.
	 static File[] listRoots() 	: trả về một mảng các đối tượng File là đại diện cho các thư mục gốc: Ví dụ C:/, D:/
	 File[] listFile()			: trả về một mảng các đối tượng File, là tập tin và các thư mục con của thư mục hiện tại.
	 File[] listFile(Filename)	: trả về một mảng các đối tượng File, là tập tin và các thư mục con của thư mục hiện tại, phù hợp với bộ lọc Filename trên tham số.
	 File[] listFile(FileFilter filter): trả về một mảng các đối tượng File, là các tập tin và thư mục con của thư mục hiện tại, phù hợp với bộ lọc filter trên tham số.
	 String[] list()			: trả về một mảng các đường dẫn, là đường dẫn của các tập tin và đường dẫn các thư mục con của thư mục hiện tại.
	 String[] list(FilenameFilter filter): Trả về một mảng các đường dẫn, là đường dẫn của các tập tin và đường dẫn của các thư mục con của thư mục hiện tại, và phù hợp với bộ lọc FiltenameFilter trên tham số.
	 
	 
	 */
	public static void main(String[] args) {
		// demo get thư mục gốc và các thư mục con trong đó
		File[] roots = File.listRoots();
		/// end get thư mục gốc
		
		
		for (File file : roots) {
			File[] lists = file.listFiles();
			System.out.println(file.getAbsolutePath());
			for (File file2 : lists) {
				System.out.println(file2.getAbsolutePath());
			}
			System.out.println("\n");
		}
	}
}

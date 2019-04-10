package FILE;

import java.io.File;
import java.io.FilenameFilter;

public class filterFile {
	/*

	 */
	private static final String FILE_DIR = "D:\\log";
	private static final String FILE_TEXT_EXT = ".txt";
	public static void main(String[] args) {
		new filterFile().listFile(FILE_DIR, FILE_TEXT_EXT);
	}
	public void listFile(String folder, String ext) {
		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir = new File(folder);
		
		if(dir.isDirectory() == false) {
			System.out.println("Directory does not exists : " + FILE_DIR);
			return;
		}
		
		String[] lists = dir.list(filter);
		for (String string : lists) {
//			String tmp = new StringBuffer(FILE_DIR).append(File.separator).append(string).toString();
			System.out.println("file : " + string);
		}
		
	}
	public class GenericExtFilter implements FilenameFilter{
		private String ext;
		public GenericExtFilter(String ext) {
			this.ext = ext;
		}
		@Override
		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}
}

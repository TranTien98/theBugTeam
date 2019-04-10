package FILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadAndWrite {

	public static void readAndwriteFromFile(File file1, File file2) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {

			fis = new FileInputStream(file1);// read file
			fos = new FileOutputStream(file2); // write file

			int c = 0;
			/*
			 có 2 cách để biết file kết thúc.
			 1. sử dụng read: nếu đọc hết thì sẽ trả về -1
			 2. sử dụng available: kí tự đọc được cuối cùng sẽ là 0.
			 */
			while ((c = fis.read()) != -1) {
				fos.write((char) c);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void readAndwriteFromKeyboard(File file1, File file2) {
		Scanner scn = null;
		BufferedWriter bfw = null;
		try {
			scn = new Scanner(file1);
			bfw = new BufferedWriter(new FileWriter(file2));
			while (scn.hasNextLong()) {
				bfw.write((char) scn.nextLong());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				scn.close();
				bfw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void readAndwriteFromBuffereader(File file1, File file2) {
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		try {
			
			bfr = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
			bfw = new BufferedWriter(new FileWriter(file2));
			
			String readLine = null;
			while((readLine = bfr.readLine()) != null) {
				bfw.write(readLine);
				System.out.println(readLine);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

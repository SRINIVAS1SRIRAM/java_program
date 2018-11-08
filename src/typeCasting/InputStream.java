package typeCasting;

import java.io.*;

public class InputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\srinivasas\\Desktop\\SampleTest.txt");
			int avl = fis.available();
			System.out.println(avl);
			byte buffer[] = new byte[avl];
			fis.read(buffer, 0, avl);
			String content = new String(buffer);
			System.out.println("Content is: " + content);
			fis.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception Arised:" + e);
		}
		catch(IOException e) {
			System.out.println("Excep Arised:" + e);
		}
		
	}

}

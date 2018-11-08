package typeCasting;

import java.io.*;


public class OutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\srinivasas\\Desktop\\SampleTest.txt");
			String content = "Srinivas had written the content";
			int count = content.length();
			for(int i=0; i<count; i++){
				fos.write(content.charAt(i));
				
			}
			System.out.println("Content is: " + content);
			fos.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception Arised:" + e);
		}
		catch(IOException e) {
			System.out.println("Excep Arised:" + e);
		}
	}

}

//This program demonstrate use of throws keyword

package issassignment.java.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	static void getFile() throws IOException {
		FileReader fr = new FileReader("file.txt");
		 char [] c = new char[50];
         fr.read(c);   
         System.out.println(String.valueOf(c));   
	}
	public static void main(String[] args) {
		try {
			getFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("Completed reading.");
	}
}

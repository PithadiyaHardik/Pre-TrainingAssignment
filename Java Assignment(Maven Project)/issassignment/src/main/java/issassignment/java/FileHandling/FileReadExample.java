//This program demonstrate the file reading in java

package issassignment.java.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr=new FileReader("FileHandling.txt");
			char [] c = new char[100];
	        fr.read(c);  
	        System.out.println(String.valueOf(c)); 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}

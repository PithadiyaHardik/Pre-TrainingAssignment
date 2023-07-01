//This program demonstrate the use of try catch blocks

package issassignment.java.ExceptionHandling;

import java.io.*;

public class TryCatchExample {

	public static void main(String[] args) {
		FileReader fr = null;		
	      try {
	         File file = new File("file.txt");
	         fr = new FileReader(file);
	         char [] c = new char[50];
	         fr.read(c);  
	         System.out.println(String.valueOf(c));  
	      } catch (IOException e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            fr.close();
	         } catch (IOException ex) {		
	            ex.printStackTrace();
	         }
	      }

	}

}

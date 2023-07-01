//This program demonstrate the file writing 

package issassignment.java.FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("FileHandling.txt");
			String data="This is ans example of writing in file using FileWriter.";
			fw.write(data);
			fw.append("This is to be appended at the end");
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Successfully completed write operation.");
		
	}
}

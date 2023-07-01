//Example to demonstrate types of loops in java

package issassignment.java.Basic;

public class Loops {
	
	public static void main(String[] args) {
		System.out.println("Printing 1-10 using for loop");
		//for loop to print 1-10
		for(int i=1;i<=10;i++)
		{
		System.out.println(i);	
		}
		
		//While loop to print 11-20
		System.out.println("Printing 11-20 using while loop");
		int i=11;
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}
		
		//Do while loop to print 21-30
		System.out.println("Printing 21-30 using do while loop");
		int j=21;
		do {
			System.out.println(j);
			j++;
		}
		while(j<=30);
	}

}

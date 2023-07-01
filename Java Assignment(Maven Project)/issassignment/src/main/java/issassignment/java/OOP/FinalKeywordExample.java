//This program demonstrate the use of final keyword

package issassignment.java.OOP;

class Bike {
	final int speedlimit=100;
	
	int getSppedLimit()
	{
		return speedlimit;
	}
}
public class FinalKeywordExample {
public static void main(String[] args) {
	Bike b=new Bike();
	System.out.println("Speed limit is: "+b.speedlimit);
}
}

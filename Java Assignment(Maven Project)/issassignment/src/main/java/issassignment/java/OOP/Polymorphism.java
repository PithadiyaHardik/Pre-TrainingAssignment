//Example program to demonstrate polymorphism.

package issassignment.java.OOP;

public class Polymorphism {
	
	public static void main(String[] args) {
		
		//Vehicle and Car classes are defined in example of Method overriding.
		Vehicle v=new Car(4,"TATA",1300000,"CB02CR1234");
		Car c=new Car(4,"Hundai",1000000,"AB06CD1234");
		v.running();
		c.running();
		
	}

}

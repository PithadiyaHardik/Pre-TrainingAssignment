//this program demonstrate the method overriding in java
package issassignment.java.OOP;


class Vehicle
{
	int numberOftyres;
	String company;
	int price;
	String licenceNumber;
	Vehicle(){}
	Vehicle(int numberOftyres, String company, int price, String licenceNumber) {
		super();
		this.numberOftyres = numberOftyres;
		this.company = company;
		this.price = price;
		this.licenceNumber = licenceNumber;
	}
	void running() {
		System.out.println("Vehicle is running.");
	}
	
}

class Car extends Vehicle
{
	Car(){}
	Car(int numberOftyres,String company,int price,String licenceNumber){
		super(numberOftyres,company,price,licenceNumber);
	}
	
	//Method overriding
	void running() {
		System.out.println("Car is runnnig.");
	}
}
  

public class MethodOverriding {

	public static void main(String[] args) {
		Vehicle v=new Vehicle(4,"TATA",1300000,"CB02CR1234");
		Car c=new Car(4,"Hundai",1000000,"AB06CD1234");
		v.running();
		c.running();
		
	}
}

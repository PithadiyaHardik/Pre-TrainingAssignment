//This program demonstrate the use of abstract  classes in java

package issassignment.java.OOP;

//abstract class
abstract class Sim
{
	//abstract method
	abstract void calling();
}


class AirtelSim extends Sim{
	void calling()
	{
		System.out.println("Calling using Airtel sim");
	}
}

class JioSim extends Sim
{
	void calling()
	{
		System.out.println("calling using Jio sim");
	}
}



public class AbstractClassDemo {
	
	public static void main(String[] args) {
		Sim s1=new AirtelSim();
		Sim s2=new JioSim();
		s1.calling();
		s2.calling();
	}
	

}

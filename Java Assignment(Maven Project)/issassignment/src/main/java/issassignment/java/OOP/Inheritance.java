//this program demonstrate the  Inheritance in java
package issassignment.java.OOP;

//Parent class
class Mobile
{
	long mobilenumber;
	
	Mobile(){}
	Mobile(long mobilenumber)
	{
		this.mobilenumber=mobilenumber;
	}
	void calling(long number) {
		System.out.println("Calling "+number);
	}
}

//Inheritance 
class Samsung extends Mobile{
	
	String modelNumber;
	Samsung(){super();}
	Samsung(long mobilenumber,String modelnumber)
	{
		super(mobilenumber);
		this.modelNumber=modelnumber;
	}
	void gaming()
	{
		System.out.println("Playing game on samsung mobile");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		Mobile m=new Mobile(123737331L);
		m.calling(7127828712L);
		Samsung s=new Samsung(8238238231L,"A23");
		s.calling(1234564551L);
		s.gaming();
		
	
		
	}
}

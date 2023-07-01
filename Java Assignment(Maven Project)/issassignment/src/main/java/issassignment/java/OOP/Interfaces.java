//This program demonstrate the use of interfaces in java


package issassignment.java.OOP;

//interface
interface Drawable
{
	void draw();
	
}

//implementing interface
class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
}
class Triangle implements Drawable{
	public void draw()
	{
		System.out.println("Drawing Triangle.");
	}
}

interface Vehicle1{
	void running();
}

//Interface extending another interface
interface Car1 extends Vehicle1{
	void getMileage();
	
}
class Ferrari implements Car1
{
	public void running() {
		System.out.println("Ferrari car is running");
	}
	public void getMileage()
	{
		System.out.println("Milage of Ferrari is 8.77 kmpl.");
	}
}


public class Interfaces {
	public static void main(String[] args) {
		Drawable c=new Circle();
		Drawable t=new Triangle();
		c.draw();
		t.draw();
		Car1 car=new Ferrari();
		car.running();
		car.getMileage();
	}

}

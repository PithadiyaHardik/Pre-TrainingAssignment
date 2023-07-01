package issassignment.java.OOP;

class Animal{
	
	//private field
	private String name;

	//public method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//protected method
	protected void displayName()
	{
		System.out.println("Name is: "+name);
	}
	
}

class Dog extends Animal
{
	//default method
	void eating()
	{
		//This is protected method that's why it can be accesed in sub class
		this.displayName();
		System.out.println("Dog named "+this.getName() +"is eatin");
	}
}

public class AccessModifers {
	
public static void main(String[] args) {
	Dog d=new Dog();
	d.setName("Tommy");
	d.eating();
}
}

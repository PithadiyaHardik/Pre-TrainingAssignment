package issassignment.java.Basic;


//Incomplete
//This class display the example of different type of variables in java
class Rectangle{
	
	//Instance variable
	int height;
	int width;
	
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	int getWidth() {
		return width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	
	//Default Constructor
	Rectangle(){}
	
	//Parameterized Constructor 
	Rectangle(int height,int width){
		this.height=height;
		this.width=width;
	}
	//Method to calculate the area of rectangle
	int getArea() {
		//local variable
		int area=height*width;
		return area;
	}
}


public class Basic2 {
	
	public static void main(String[] args) {
		//Primitive Data types
		byte b=127;
		short s=32767;
		int i=2147483647;
		long l=9223372036854775807L;
		float f=234.5f;
		double d=123.45;
		boolean bl=true;
		char c='a';
		
		//Printing Primitive data type variables
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
		System.out.println(c);
		
		
		//Reference Type Variable 
		Rectangle r=new Rectangle(15,30);
		System.out.println(r.getArea());
		
		
		
	}

}

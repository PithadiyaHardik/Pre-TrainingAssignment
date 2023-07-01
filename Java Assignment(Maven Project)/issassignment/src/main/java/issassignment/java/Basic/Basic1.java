//This program demonstrate class, object,instance variables and methods

package issassignment.java.Basic;

//class declaration
class Student{
	String name;
	int rollno;
	int standard;
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getRollno() {
		return rollno;
	}

	void setRollno(int rollno) {
		this.rollno = rollno;
	}

	int getStandard() {
		return standard;
	}

	void setStandard(int standard) {
		this.standard = standard;
	}
	//default constructor
	Student()
	{
		
	}
	
	//parameterized constructor
	Student(String name, int rollno, int standard) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.standard = standard;
	}
	
}

public class Basic1 {
	
	
	
	public static void main(String[] args) {
		//Object creation
		Student s=new Student("Hardik",11,10);
		
		//Accessing instance variables
		System.out.println(s.name);
		System.out.println(s.rollno);
		System.out.println(s.standard);
		
		//Calling object methods
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		System.out.println(s.getStandard());
		
		Student s2=new Student();
		
		s2.setName("Ilesh");
		s2.setRollno(19);
		s2.setStandard(8);
		
		System.out.println(s2.getName());
		System.out.println(s2.getRollno());
		System.out.println(s2.getStandard());
		
		
	}
	
	

}

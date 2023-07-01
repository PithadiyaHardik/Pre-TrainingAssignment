package issassignment.java.Collections;


public class Student implements Comparable<Student>{
	
	String name;
	int rollNumber;
	int standard;
	Student(){}
	public Student(String name, int rollNumber, int standard) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", standard=" + standard + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return  this.rollNumber - o.rollNumber;
	}
}

//This program demonstrate the Encapsulation in java

package issassignment.java.OOP;

class Employee
{
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Raj");
		e.setSalary(1234456);
		System.out.println("Employee id :"+e.getId()+" Employee name: "+e.getName()+" Employee salary: "+e.getSalary());
	}

}

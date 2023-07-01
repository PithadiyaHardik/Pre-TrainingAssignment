package issassignment.java.Collections;

import java.util.*;
public class SetExample {
	public static void main(String[] args) {
		
		
		//Set with primitive data type
		Set<Integer> set=new HashSet<Integer>();
		
		System.out.println("Operations of primmitive data type set");
		
		//Adding element in set
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(50);
		
		System.out.println("Original Set: "+set);
		//size of set
		int size=set.size();
		System.out.println("Size of set: "+size);
		
		//set contains element or not
		boolean contains=set.contains(20);
		System.out.println("Set contains 20: "+contains);
		//removing element from set
		set.remove(50);
		System.out.println("Set after remove operation: "+set);
		
		//reseting set
		set.clear();
		
		
		//Set of custom object
		Set<Student> customSet=new HashSet<Student>();
		
		Student s1 = new Student("Abhishek", 1, 7);
		Student s2 = new Student("Aarti", 3, 7);
		Student s3 = new Student("Raju", 11, 7);
		Student s4 = new Student("Zack", 34, 7);
		Student s5=new Student("Abhinav",112,12);
		
		
		System.out.println("Operations of set of custom objects");
		
		//Adding element in set
		customSet.add(s1);
		customSet.add(s2);
		customSet.add(s1);
		customSet.add(s3);
		customSet.add(s4);
		
		System.out.println("Original custom  Set: "+customSet);
		
		//size of custom set
		int customSize=customSet.size();
		System.out.println("Size of custom object set: "+customSize);
		
		//custom set contains element or not
		boolean customContains=customSet.contains(s2);
		
		System.out.println("custom objectset contains "+s2+" : "+customContains);
		
		//removing element from set
		customSet.remove(s1);
		System.out.println("custom set object after remove operation: "+customSet);
		
		//reseting set
		customSet.clear();
		
		
	}
	

}

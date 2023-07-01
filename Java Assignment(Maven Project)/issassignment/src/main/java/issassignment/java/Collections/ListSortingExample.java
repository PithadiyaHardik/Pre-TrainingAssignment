//This program demonstrate te sorting of list using comprator and comparable

package issassignment.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MarksComparator implements  Comparator<Marks>
{

	public int compare(Marks o1, Marks o2) {
		int sum1=o1.english+o1.hindi+o1.maths+o1.science+o1.socialScience;
		int sum2=o2.english+o2.hindi+o2.maths+o2.science+o2.socialScience;
		return sum1-sum2;
	}
	
}

public class ListSortingExample {
	public static void main(String[] args) {
		List<Integer> primitiveList = new ArrayList<Integer>();
		primitiveList.add(100);
		primitiveList.add(2);
		primitiveList.add(300);
		primitiveList.add(40);
		
		System.out.println("List before sorting: "+primitiveList);
		//Sorting primitive data type list
		Collections.sort(primitiveList);
		System.out.println("After sorting: "+primitiveList);
		
		
		
		List<Student> customList1 = new ArrayList<Student>();
		Student s1 = new Student("Abhishek", 1, 7);
		Student s2 = new Student("Aarti", 3, 7);
		Student s3 = new Student("Raju", 11, 7);
		Student s4 = new Student("Zack", 34, 7);
		
		customList1.add(s4);
		customList1.add(s2);
		customList1.add(s1);
		customList1.add(s3);
		
		
		System.out.println("custom object list before sorting: " +customList1);
		//Sorting using Comparable interface
		Collections.sort(customList1);
		System.out.println("custom object list after sorting using comparable: " +customList1);
		
		List<Marks> customList2 = new ArrayList<Marks>();
		Marks m1 = new Marks(67, 65, 78, 65, 78);
		Marks m2 = new Marks(76, 56, 77, 56, 77);
		Marks m3 = new Marks(67, 56, 98, 65, 76);
		Marks m4 = new Marks(56, 45, 65, 36, 71);
		Marks m5 = new Marks(56 , 65, 78, 87, 90);
		
		customList2.add(m1);
		customList2.add(m2);
		customList2.add(m3);
		customList2.add(m4);
		customList2.add(m5);
		
		System.out.println("custom objecct list before sorting: "+customList2);
		//Sorting using comparator
		Collections.sort(customList2,new MarksComparator());
		System.out.println("custom List after sorting using comparator: "+customList2);
		
	
	
	}

}

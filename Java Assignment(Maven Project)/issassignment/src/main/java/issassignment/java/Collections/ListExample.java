package issassignment.java.Collections;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {

		// List for storing primitive data types
		List<Integer> primitiveList = new ArrayList<Integer>();
		System.out.println("LIST WITH PRIMITIVE DATATYPE:");

		// adding elements in list
		primitiveList.add(10);
		primitiveList.add(20);
		primitiveList.add(30);
		primitiveList.add(40);

		System.out.println("original list: " + primitiveList);

		// removing element
		primitiveList.remove(2);
		System.out.println("After removal: " + primitiveList);

		// getting element from list
		int ele = primitiveList.get(1);
		System.out.println("Element at index 3: " + ele);

		// checking if list is empty
		boolean isEmpty = primitiveList.isEmpty();
		System.out.println("Is list empty: " + isEmpty);

		// if list contains element or not
		boolean contains = primitiveList.contains(new Integer(10));
		System.out.println("List contains 10: " + contains);

		// Get the size of list
		int size = primitiveList.size();
		System.out.println("Size of list: " + size);

		// get index of element
		int index = primitiveList.indexOf(new Integer(10));
		System.out.println("Index of 10 is: " + index);

		// List of custom objects
		List<Student> customObjectList = new ArrayList<Student>();

		System.out.println("LIST WITH CUSTOM OBJECT:");

		// Custom objects
		Student s1 = new Student("Abhishek", 1, 7);
		Student s2 = new Student("Aarti", 3, 7);
		Student s3 = new Student("Raju", 11, 7);
		Student s4 = new Student("Zack", 34, 7);

		// adding elements in list
		customObjectList.add(s1);
		customObjectList.add(s2);
		customObjectList.add(s3);
		customObjectList.add(s4);

		System.out.println("original list: " + customObjectList);

		// removing element
		customObjectList.remove(s1);
		System.out.println("After removal: " + customObjectList);

		// getting element from list
		Student ele2 = customObjectList.get(1);
		System.out.println("Element at index 3: " + ele);

		// checking if list is empty
		boolean isEmptyCustom =customObjectList.isEmpty();
		System.out.println("Is list empty: " + isEmptyCustom);

		// if list contains element or not
		boolean containsCustom = customObjectList.contains(s1);
		System.out.println("List contains {name:Abhishek,roll no:1,standard=7}: " + containsCustom);

		// Get the size of list
		int sizeCustom = customObjectList.size();
		System.out.println("Size of list: " + sizeCustom);

		// get index of element
		int indexCustom = customObjectList.indexOf(s1);
		System.out.println("Index of {name:Abhishek,roll no:1,standard=7} is: " + indexCustom);

	}

}

package issassignment.java.Collections;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {

		
		// Map with primitive data type
		Map<Integer, Integer> primitiveMap = new HashMap<>();

		System.out.println("Operation of primitive type map:");
		
		// Adding elements in map
		primitiveMap.put(1, 100);
		primitiveMap.put(2, 123);
		primitiveMap.put(4, 1532);
		primitiveMap.put(12, 63827);
		primitiveMap.put(121, 876);

		System.out.println("Original map" + primitiveMap);

		// Getting size of map
		int size = primitiveMap.size();
		System.out.println("Size of Map is: " + size);

		// getting element using key
		int ele = primitiveMap.get(12);
		System.out.println("Value with key 12 is: " + ele);

		// getting element using getOrDefault
		int ele1 = primitiveMap.getOrDefault(111, -1);
		System.out.println("Value with key 111 is: " + ele1);

		// Map is empty or not
		boolean isEmpty = primitiveMap.isEmpty();
		System.out.println("Is Map empty: " + isEmpty);

		// replacing value in map
		primitiveMap.replace(1, 1230);

		// Traversing map
		for (Map.Entry<Integer,Integer> m : primitiveMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// removing element from map
		primitiveMap.remove(2);
		System.out.println("After remove operation: " + primitiveMap);

		// Contains key
		boolean contains = primitiveMap.containsKey(1);
		System.out.println("Map contains key 1 :" + contains);

		// Resetting map
		primitiveMap.clear();

		// Custom object Map
		Map<Student, Marks> customObjectMap = new HashMap<>();
		System.out.println("Operation custom object type map:");

		// Objects of student class
		Student s1 = new Student("Abhishek", 1, 7);
		Student s2 = new Student("Aarti", 3, 7);
		Student s3 = new Student("Raju", 11, 7);
		Student s4 = new Student("Zack", 34, 7);
		Student s5=new Student("Abhinav",112,12);

		// Objects of Marks
		Marks m1 = new Marks(67, 65, 78, 65, 78);
		Marks m2 = new Marks(76, 56, 77, 56, 77);
		Marks m3 = new Marks(67, 56, 98, 65, 76);
		Marks m4 = new Marks(56, 45, 65, 36, 71);
		Marks m5 = new Marks(56 , 65, 78, 87, 90);
		
		// Adding elements in custom map
		customObjectMap.put(s1, m1);
		customObjectMap.put(s2, m2);
		customObjectMap.put(s3, m3);
		customObjectMap.put(s4, m4);

		System.out.println("Original custom object map" + customObjectMap);

		// Getting size of map
		int sizeCustom = customObjectMap.size();
		System.out.println("Size of custom object Map is: " + sizeCustom);

		// getting element using key
		Marks eleCustom = customObjectMap.get(s1);
		System.out.println("Value with key {name:Abhishek,roll no:1,standard=7} is: " + eleCustom);

		// getting element using getOrDefault
		Marks eleCustom1 = customObjectMap.getOrDefault(s5,null);
		System.out.println("Value with key {name:Abhinav,roll no:112,standard=12} is: " + eleCustom1);

		// Map is empty or not
		boolean isEmptyCustom = customObjectMap.isEmpty();
		System.out.println("Is Map empty: " + isEmptyCustom);

		// replacing value in map
		customObjectMap.replace(s1, m5);

		// Traversing map
		for (Map.Entry<Student,Marks> m : customObjectMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// removing element from map
		customObjectMap.remove(s2);
		System.out.println("After remove operation: " + customObjectMap);

		// Contains key
		boolean containscustom = customObjectMap.containsKey(s1);
		System.out.println("Map contains key"+s1+ " :" + containscustom);

		// Resetting map
		customObjectMap.clear();

	}

}

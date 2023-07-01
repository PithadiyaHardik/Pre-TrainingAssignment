//This program demonstrate the use of strings in java

package issassignment.java.Basic;

import java.util.Arrays;

public class JavaStrings {
	public static void main(String[] args) {
		
		//Two ways to create String in java
		String str1="Hello world";//Using string literal
		String str2=new String("Welcome"); //Using new keyword
		
		System.out.println(str1);
		System.out.println(str2);
		
		//Various String methods
		
		
		char c=str1.charAt(3);//charAt method returns the character at specified index
		System.out.println("char at index is : "+c);
		
		int length=str1.length();//length method returns length of string
		System.out.println("Length of string is "+length);
	
		String substr=str1.substring(0,4); //substring method returns part of string  using specified start and end index
		System.out.println("Substring from start index 0 to end index 4 is "+ substr);
		
		boolean isPresent=str1.contains("welcome");//It checks whether string contains charsequence or not 
		System.out.println("Welcome is present in original string or not: "+isPresent);
		
		
		String joinedString=String.join(",",str1,str2);//join method joins given strings
		System.out.println("Joined string is "+joinedString);
		
		boolean result=str1.equals(str2); //It is used to check weather two strings are equal or not
		System.out.println("Two strings are equal or not: "+result);
		
		boolean isEmpty=str1.isEmpty(); //It checks weather string is empty or not
		System.out.println("String is empty or not: "+isEmpty);
		
		String concatedString=str1.concat(str2); //It concatenates the specified string.
		System.out.println("Concated string is: "+concatedString);
		
		String replacedString=str1.replace("hello", "new"); //It replaces all occurrences of the specified charsequence value.
		System.out.println("String after replacement "+replacedString);
		
		String str4="WELCOME";
		boolean isEqual=str2.equalsIgnoreCase(str4);//It compares another string. It doesn't check case.
		System.out.println("Result of comparing "+ str2+ " and "+ str4 +" using equalIgnoreCase method : " +isEqual);
		
		String[] splittedStrings=str1.split(" "); //It returns a split string matching regex.
		System.out.println("Strings generated after splitting :"+Arrays.toString(splittedStrings));
		String str5=str1.intern(); //It returns conical representation of string.
		System.out.println("String generated using intern method: "+str5);
		
		int index=str1.indexOf('o'); //It returns index of specified character
		System.out.println("Index of character `o ` in String `"+str1+"` is : "+index );
		
		int index2=str1.indexOf('l',1); //	It returns the specified char value index starting with given index.
		System.out.println("Index of character `l` in String `"+str1+"` starting from index 1  is : "+index2 );
		
		int indexOfSubstring=str1.indexOf("world"); //It returns the specified substring index.
		System.out.println("Index of string `world` in `"+ str1 +"` is : "+indexOfSubstring);
		
		
		String lowercased=str1.toLowerCase();//Converts string to lower case
		System.out.println(lowercased);
		
		String uppercased=str1.toUpperCase();//Converts string to upper case
		System.out.println(uppercased);
		
		String str6="   string for trimming  ";
		String trimmedString=str6.trim();
		System.out.println("Original string: `"+str6+"` Trimmed string : "+trimmedString);
		
		
		int integerValue=564573;//It convert given value int value to string
		System.out.println(String.valueOf(integerValue));
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
	}

}
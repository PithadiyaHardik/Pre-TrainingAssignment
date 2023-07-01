//Example to demonstrate different types of conditional statement in java


package issassignment.java.Basic;

public class DecisionMaking {
public static void main(String[] args) {
	int age=19;
	//if statement
	if(age>=18)
	{
		System.out.println("You can vote.");
	}
	
	//if else statement
	int number=20;
	if(number%2==0)
	{
	System.out.println("Number is even.");	
	}
	else {
	System.out.println("Number is odd");	
	}
	
	//if else ladder
	int x=9;
	if(x>15)
	{
		System.out.println("x is greater than 15");
	}
	else if(x>10)
	{
		System.out.println("x is greater than 10 but less than or equal to 15 ");
	}
	else if(x>5)
	{
		System.out.println("x is greater than 5 but less than or equal 10");
	}
	else {
		System.out.println("x is less than or equal to 5");
	}
	
	//Nested if statement
	int weight=70;
	if(age>=18)
	{
		if(weight>=60)
		{
			System.out.println("You can donate blood");
		}
	}
	else {
		System.out.println("You are not eligible to donate blood.");
	}
	
	//Switch case 
	int num1=10;
	int num2=20;
	char operator='+';
	switch(operator)
	{
	case '+':
		System.out.println("Addition of two number is "+(num1+num2));
		break;
	case '-':
		System.out.println("Subtraction of two number is "+(num1-num2));
		break;
	default: 
		System.out.println("No opeation is done.");
	
	}
}
}

//This program deomostrate the use of throw keyword

package issassignment.java.ExceptionHandling;


//Custom exception class
class AgeNotMatchingException extends RuntimeException {
	
	AgeNotMatchingException(String msg) {
		super(msg);
	}
}

class Voting {
	
	void vote() {
		int age = 11;
		
		if(age>=18) {
			System.out.println("You can vote!");
		} else {
			//Throwing exception
			throw new AgeNotMatchingException("Age must be greater or equals to 18");
		}
	}
	
}

public class ThrowExample {

	public static void main(String[] args) {
		
		Voting v = new Voting();
		try {
			v.vote();
		} catch(AgeNotMatchingException e) {
			System.out.println(e);
		}
		
	}
	
}
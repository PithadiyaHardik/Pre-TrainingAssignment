package issassignment.java.Basic;

class Account{
	//static variable
	static String bankName="HDFC bank";
	
	//static method
	static  int getRateOfInterest(){
		return 6;
	}
}

public class StaticKeywordExample {
public static void main(String[] args) {
	System.out.println("Bank Name: "+Account.bankName);
	System.out.println("Rate of interest: "+Account.getRateOfInterest());
	
}
}

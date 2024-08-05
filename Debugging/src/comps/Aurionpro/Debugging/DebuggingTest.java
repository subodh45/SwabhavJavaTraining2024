package comps.Aurionpro.Debugging;
import java.util.*;

public class DebuggingTest {
 public static void main(String[] args) {
	
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Enter 1st number:");
	int number1 =sc.nextInt();
	
	System.out.println("Enter 2nd number:");
	int number2 =sc.nextInt();
	
	int result =addition(number1,number2);
	System.out.println(result);
	
	int sub =substraction(number1,number2);
	System.out.println(sub);
	
	int multiply =multiply(number1,number2);
	System.out.println(multiply);
}

private static int multiply(int number1, int number2) {
	// TODO Auto-generated method stub
	 return number1*number2;
}

private static int substraction(int number1, int number2) {
	// TODO Auto-generated method stub
	return number1-number2;
}

private static int addition(int number1, int number2) {
	// TODO Auto-generated method stub
	return number1 +number2;
}
}

package comp.Aurionpro.info;
import java.util.*;
public class AdditionOfNumber {
  public static void main(String[] args) {
	
	 System.out.println("Enter first number :");
     Scanner sc = new Scanner(System.in);	
     int num1 = sc.nextInt();
     
     System.out.println("enter second number :");
     int num2 = sc.nextInt();
     
     int res = num1+num2;
     
     System.out.println("Addition of  "+ num1 +"and  "+ num2 + " is "+ res);
}
}

package comp.Aurionpro.CommandLineArgumnet;

public class NumberSwap2CLA {
   public static void main(String[] args) {
	
	   int number1 = Integer.parseInt(args[0]);
	   int number2 = Integer.parseInt(args[1]);
	   
	   System.out.println("before swap : num1 "+number1 + " num2 ="+ number2 );
	   
	   number1 = number1 + number2;
	   number2 = number1- number2;
	   number1 = number1-number2;
	   
	   System.out.println("After swap : num1 "+number1 + " num2 ="+ number2 );
}
}

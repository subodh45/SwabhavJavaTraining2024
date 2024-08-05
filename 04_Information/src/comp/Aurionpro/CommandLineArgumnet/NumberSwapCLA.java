package comp.Aurionpro.CommandLineArgumnet;

public class NumberSwapCLA {
 public static void main(String[] args) {
	
	 int number1 =Integer.parseInt(args[0]);
	 
	 int number2 = Integer.parseInt(args[1]);
	 
	 int number1s = number2;
	 
	 number2 = number1;
	 
   	 number1 = number1s;
	 
	 System.out.println("1st no = "+ number1 + " 2nd number ="+ number2);
}
}

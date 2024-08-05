package comp.Aurionpro.CommandLineArgumnet;

public class SimpleInterestCalculatorCLA {

	public static void main(String[] args) {
		
		double PrincipleAmount = Double.parseDouble(args[0]);
		double rateofinterest = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		
		double res = PrincipleAmount * rateofinterest * years /100;
		
		System.out.println("total interest gets = "+ res );
	}
}

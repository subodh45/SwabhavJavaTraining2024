package comp.Aurionpro.CommandLineArgumnet;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		double radius = Double.parseDouble(args[0]);
		
		double res = 3.14 * radius * radius ;
		
		System.out.println("area of cicrle is "+ res);
	}
}

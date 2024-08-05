package comp.Aurionpro.info;

import java.util.*;

public class AreaOfCircle {
   public static void main(String[] args) {
	
	   System.out.println("Enter Area of circle ");
	   Scanner sc = new Scanner(System.in);
	   double radius = sc.nextDouble();
	   
	   double res = 3.14 * radius * radius;
	   
	   System.out.println("Area of cicle whose radius is "+ radius + " is "+res);
	   
}
}

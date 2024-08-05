package comp.Aurionpro.Homework;
import java.util.*;

public class BmiFinder {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter your height(meters )");
	  double height = sc.nextDouble();
	  
	  System.out.println("enter your Weight(kilograms )");
	  double weight = sc.nextDouble();
	  
	  double bodymassindex = weight / (height * height);
	    
	  System.out.println("your BMI score is "+ bodymassindex);
	  	  
  }
}

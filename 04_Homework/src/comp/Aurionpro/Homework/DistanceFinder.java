package comp.Aurionpro.Homework;
import java.util.*;

public class DistanceFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter x coordinates of point 1 (x1)");
		double x1 = sc.nextDouble();
		
		System.out.println("enter y coordinates of point 1 (y1)");
		double y1 = sc.nextDouble();
		
		System.out.println("enter x coordinates of point 2 (x2)");
		double x2 = sc.nextDouble();
		
		System.out.println("enter y coordinates of point 2 (y2)");
		double y2 = sc.nextDouble();
		
		double distance = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
		
		System.out.println("Distance between given two point is "+ distance);
	}

}

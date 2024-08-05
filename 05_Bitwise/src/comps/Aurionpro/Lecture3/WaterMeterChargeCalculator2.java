package comps.Aurionpro.Lecture3;
import java.util.*;

public class WaterMeterChargeCalculator2 {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter number of units consumed :");
	   int units = sc.nextInt();
	   
	   int metercharge = 75;
	   int charge,Total_water_bill;
	   
	   if(units <=100)
	   {
		   charge = units * 5;
		   Total_water_bill = charge + metercharge;
		  
	   }
	   else
	   {
		   if(units <=250)
		   {
			   charge = (100 * 5) + ((units-100)*10);
			   Total_water_bill = charge + metercharge;
			  
		   }
		   else
		   {
			   charge = (100 * 5) +(150*10) + ((units-250)*20) ;
			   Total_water_bill = charge + metercharge;
			 
		   }
	   }
	   
	   System.out.println("Total water bill is " + Total_water_bill);
	   
}
}

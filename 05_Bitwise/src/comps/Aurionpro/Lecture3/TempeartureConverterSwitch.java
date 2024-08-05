package comps.Aurionpro.Lecture3;
import java.util.*;

public class TempeartureConverterSwitch {
	
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        switch(choice)
        {
            case 1:  temperature = (temperature *(9/5)) + 32 ;
                     System.out.println("Tempearture in fahrenheit is "+ temperature);
                     break;
            		
            
            case 2:  temperature = (temperature -32) * 5/9;
                     System.out.println("Tempearture in celsius is "+ temperature);
                     break;
  		             
            
            case 3:  temperature = temperature + 273.15 ;
                      System.out.println("Tempearture in Klevin is "+ temperature);
                      break;
  		             
            
            case 4:  temperature = temperature - 273.15 ;
                     System.out.println("Tempearture in celsius is "+ temperature);
                     break;
                     
            
            case 5:  temperature = ((temperature-32)*5/9) + 273.15 ;
                     System.out.println("Tempearture in Klevin is "+ temperature);
                     break;
                     
            
            case 6:  temperature = ((temperature - 273.15)*9/5) + 32 ;
                     System.out.println("Tempearture in fahrenheit is "+ temperature);
                     break;
                    
        }

	}

}

package comps.Aurionpro.ArrayTest;
import java.util.*;

public class ArrayTest {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter size of array ");
	 int size = sc.nextInt();
	 
	 int numArray[]=new int[size];
	 
	 for(int i=0;i<size;i++)
	 {   System.out.println("enter "+(i+1) +" value ");
		 numArray[i]=sc.nextInt();
	 }
	 
	 System.out.println("Succesfully initiate array.");
	 
	 for(int i=0;i<size;i++)
	 {
		 System.out.print(numArray[i] + " ");
	 }
}
}

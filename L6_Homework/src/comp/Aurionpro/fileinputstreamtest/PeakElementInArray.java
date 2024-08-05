package comp.Aurionpro.fileinputstreamtest;
import java.util.*;

public class PeakElementInArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of array.");
	int size =sc.nextInt();
	
	int numarray[]=new int[size];
	
	System.out.println("enter element to be add ");
	for(int i=0;i<size;i++)
	{   
		numarray[i]=sc.nextInt();
	}
	
	
	System.out.println("Your Array: ");
	for(int i=0;i<size;i++)
	{   
		System.out.print(numarray[i]+" ");
	}
	int element;
	int preElement,postElement;
	System.out.println();
	System.out.println("Peak elements are : ");
	for(int i=1;i<(size-1);i++)
	{
		element =numarray[i];
		preElement =numarray[i-1];
		postElement =numarray[i+1];
		
		if(element >=preElement && element >=postElement)
		{
			System.out.print(" "+element+" " );
		}
	}
}
}

package comp.Aurionpro.fileinputstreamtest;

public class SecondMaxElementFinder {
public static void main(String[] args) {
	
	int array1[] = { 4, 7, 2, 6, 9, 11 };
	  
	System.out.println("given array:");
	for(int element:array1)
	{
		System.out.print(element + " ");
	}
	System.out.println();
	int ele1,ele2;
	
	int max = array1[0];
	int secondMax = array1[1];
	
	for(int element:array1)
	{
		if (element > max) {
            secondMax = max;
            max = element;
        } else if (element > secondMax && element != max) {
            secondMax = element;
        }
	}
		
	System.out.println("Second Maximum Element is "+ secondMax);
}
	
}

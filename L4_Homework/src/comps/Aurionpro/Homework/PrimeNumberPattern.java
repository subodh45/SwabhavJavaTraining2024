package comps.Aurionpro.Homework;

public class PrimeNumberPattern {
  public static void main(String[] args) {
	  
	  int n=100;
	  int n2=5;
	  int number;
	  
	  for( number=2;number<=n;number++)
	  { 
		boolean isPrime =true;  
		
		for(int i=2;i<number;i++)
		{
			
			if(number%i==0)
			{
				isPrime=false;
				break ;
			}
		}
		int value;
		if(isPrime)
		{    boolean print=false;
		     first:
			 for(int line=1;line<n2;line++)
				{   
				 second:
					for( value=1;value<=line;value++)
					{   if(value==line) {
						System.out.print(number+" ");
						print=true;
						isPrime=false;
						break first;
				     	}
					    else {
					    	if(!print) {
					    	System.out.print(number+" ");
					    	isPrime=false;
					    	break first;
					    	}
					    }					
					}
					
					if(value ==line) {
						System.out.println();
						line++;
						break;
					}
					
					
				}
		}		
		
		  
	  }
	  
	 
}
}

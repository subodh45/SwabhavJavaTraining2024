package comps.Aurionpro.Debugging;

public class MethodCallingMethodDebug {
 public static void main(String[] args) {
	
	 byte a = (byte)(10+10.5); 
	 
	 int b=23;
	 double d = 22.6;
	 int dd=(int)(b+d);
	 
	 System.out.println(a);
	 int number1 = 23;
	 int number2 =34;
	 
	 addition(number1 ,number2);
	 substraction(number1,number2);
	 
}

private static int substraction(int number1, int number2) {
	// TODO Auto-generated method stub
	int result2=number1-number2;
	
	evenOdd(result2);
	return result2;
}

private static int addition(int number1,int number2) {
	// TODO Auto-generated method stub
	  int result =number1+number2;
	 
	  evenOdd(result);
	  return result;
}

private static void evenOdd(int result) {
	// TODO Auto-generated method stub
	if(result%2==0)
	{
		System.out.println("Even number ");
		System.out.println("Even odd method get executed");
	}
	else {
		System.out.println("odd number ");
		System.out.println("Even odd method get executed");
	}
}
}

package Calci.Aurionpro.calci;


class Calci
{
	
    
    public void Addition(int a , int b)
    {   int res = a+b;
    	System.out.println("Addition is " + res);
    }
    
    public void Substraction(int a , int b)
    {   int res = a-b;
    	System.out.println("Substraction is " + res);
    }
    
    public void Multiplication(int a , int b)
    {   int res = a*b;
    	System.out.println("product is " + res);
    }
    
    public void Division(int a , int b)
    {   int res = a/b;
    	System.out.println("Division is " + res);
    }
    
}

public class CalculatorTest {
	   public static void main(String[] args) {
		 int a =20;
		 int b = 10;
				 
		   Calci c = new Calci();
		   
		   c.Addition(a,b);
		   c.Substraction(a,b);
		   c.Division(a, b);
		   c.Multiplication(a, b);
	}
}
package com.Aurionpro.Model;

public class AccessCheckerTest {
  public static void main(String[] args) {
	
	  AccessChecker ac1 = new AccessChecker();
	  
	  ac1.display();
	  ac1.numberDefault=20;
	  ac1.numberProtected=20;
	  ac1.numberPublic=20;
	  
	  ac1.display();
}
} 

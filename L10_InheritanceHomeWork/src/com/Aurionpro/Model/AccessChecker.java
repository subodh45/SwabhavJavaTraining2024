package com.Aurionpro.Model;

public class AccessChecker {

	  int numberDefault=10;
	  private int numberPrivate =20;
	  protected int numberProtected=30;
	  public int numberPublic =40;
	  
	  public void display()
	  {
		  System.out.println("default "+numberDefault );
		  System.out.println("private "+numberPrivate);
		  System.out.println("protected "+ numberProtected);
		  System.out.println("public "+ numberPublic);
	  }
	
}



package com.Aurionpro.ObjectCasthelenics.Test;
import com.Aurionpro.ObjectCasthelenics.*;

public class ConstructionChainingTest {
  public static void main(String[] args) {
	
	  ConstructionChaining constructionChaining =new ConstructionChaining(40,30);
	  ConstructionChaining constructionChaining2 =new ConstructionChaining();
	  ConstructionChaining constructionChaining3 =new ConstructionChaining(40,50,80);
	  
	  System.out.println(constructionChaining);
	  System.out.println(constructionChaining2);
	  System.out.println(constructionChaining3);
}
}

package com.aurionpro.guitar.test;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.aurionpro.guitar.model.*;

public class GuitarTester {
public static void main(String[] args) {
	

  
  List<Guitar> guitars = new ArrayList<Guitar>();
  
  Inventory inventory = new Inventory();
  
  initializeInventory(inventory);
  
  GuitarSpec spec = new GuitarSpec(Builder.FENDER,"stratocastor",1,Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
  
  Guitar WhatErinLikes = new Guitar("2" ,6000,spec);
  
  List resguitars = inventory.search(spec);  
  
  if(!resguitars.isEmpty())
  {   System.out.println("You might Likes this Guitars :");
    
      for(Iterator i = resguitars.iterator();i.hasNext();)
      {	  
          Guitar guitar = (Guitar)i.next();
          GuitarSpec guitarSpec = guitar.getSpec();
          
	     System.out.println("Erin , you might like "+
	    		 guitarSpec.getBuilder() +" "+ guitarSpec.getModel()
            +" "+ guitarSpec.getType() +" Guitar:\n" +
            " "+ guitarSpec.getBackWood() +" back and side ,\n "+
             guitarSpec.getTopWood() + " price is only "+
            guitar.getPrice()
	      );
      }  
  }
  else
  {
	  System.out.println("Sorry Erin , we have nothing for you");
  }
}

private static void initializeInventory(Inventory inventory) {
	// TODO Auto-generated method stub
	// inventory.addGuitar("1" ,5500,"Builder","model","type", "backwood", "topWood");
	 inventory.addGuitar("2" ,6000,new GuitarSpec(Builder.FENDER,"stratocastor",12,Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
	 inventory.addGuitar("3" ,6000,new GuitarSpec(Builder.FENDER,"stratocastor",12,Type.ACOUSTIC, Wood.ALDER, Wood.ALDER));
	 inventory.addGuitar("4" ,8000,new GuitarSpec(Builder.FENDER,"stratocastor",12,Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
	 inventory.addGuitar("1" ,6000,new GuitarSpec(Builder.COLLINGS,"stratocastor",8,Type.ELECTRIC, Wood.ADIRONDACK, Wood.CEDAR));
	 
}
}

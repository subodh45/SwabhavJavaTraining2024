package com.aurionpro.creational.builder.model;

import java.util.List;
import java.util.ArrayList;

public class CDType {
	 private List<IPacking> items=new ArrayList<IPacking>();  
	    public void addItem(IPacking packs) {    
	           items.add(packs);  
	    }  
	    public void getCost(){  
	     for (IPacking packs : items) {  
	               packs.price();  
	     }   
	    }  
	    public void showItems(){  
	     for (IPacking packing : items){  
	    System.out.print("CD name : "+packing.pack());  
	    System.out.println(", Price : "+packing.price());  
	 }       
	   }     
}


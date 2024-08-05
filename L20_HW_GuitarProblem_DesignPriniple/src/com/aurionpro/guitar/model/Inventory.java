package com.aurionpro.guitar.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
    private	List guitars;
		
	public Inventory() {
		super();
		guitars = new LinkedList();
	}



	public void addGuitar(String serialNumber ,double price,GuitarSpec spec)
	{
		guitars.add(new Guitar(serialNumber ,price,spec));
		System.out.println("Guitar Added Successfully.");
	}
	
	
	public Guitar getGuitar(String serialNumber)
	{
		for(Iterator i = guitars.iterator(); i.hasNext(); )
		{
			Guitar guitar = (Guitar) i.next();
			
			if(guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		return null;
	}
	
	public List search(GuitarSpec searchGuitar)
	{  
		List matchingGuitar = new LinkedList();
		for(Iterator i =guitars.iterator() ; i.hasNext();)
		{
			Guitar guitar = (Guitar) i.next();
			 GuitarSpec guitarSpec = guitar.getSpec();
			 
			 if(guitarSpec.matches(searchGuitar))
				 matchingGuitar.add(guitar);
		}
		
		return matchingGuitar;
		
	}

}

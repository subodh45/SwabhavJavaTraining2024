package com.Aurionpro.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		 LinkedList<String> names = new LinkedList<String>();
		
		 
		 System.out.println(names);
		 System.out.println(names.size());
		 
		 names.add("Subodh");
		 names.add("magar");
		 names.add("harshati");
		 names.add(3,"rohit");
		 names.addFirst("master");
		 names.addLast("slave");
		 names.add("slave");
		 
		 names.get(2);
		 System.out.println(names.contains("Subodh")); 
		 names.set(1, "Virat");
		System.out.println(names.lastIndexOf("slave"));
		System.out.println(names.indexOf("slave"));
		 
		 System.out.println(names);
	}

}

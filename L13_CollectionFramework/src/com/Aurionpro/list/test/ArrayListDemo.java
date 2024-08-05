package com.Aurionpro.list.test;

import java.util.*;

public class ArrayListDemo {
 public static void main(String[] args) {
	
	 List <String> names = new ArrayList<String>();
	 List<String>lnames = Arrays.asList("Magar","farde","sharma","kohli");
	 List<String>names2 = Arrays.asList("Magar","farde","sharma","sawant");
	 
	 System.out.println(names);
	 System.out.println(names.size());
	 
	 names.add("Subodh");
	 names.add("magar");
	 names.add("harshati");
	 names.add(3,"rohit");
	 
	 names.get(2);
	 System.out.println(names.contains("Subodh")); 
	 names.set(1, "Virat");
	 
	 names.remove(1);
	 names.add("virat");
	 names.addAll(lnames);
	 Collections.sort(names);
	 System.out.println(names);
}
}

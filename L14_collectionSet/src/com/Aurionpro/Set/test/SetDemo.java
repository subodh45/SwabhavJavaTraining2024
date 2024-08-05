package com.Aurionpro.Set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	
	Set<String>set =new HashSet<String>();
	LinkedHashSet<String>set1 =new LinkedHashSet<>();
	TreeSet<String>set3 =new TreeSet<String>();
	
	set.add("Suhas");
	set.add("jateen");
	set.add("Subodh");
	set.add("Deep");
	
	set1.add("Suhas2");
	set1.add("jateen2");
	set1.add("Subodh2");
	set1.add("Deep2");
	
	set3.add("Suhas2");
	set3.add("jateen2");
	set3.add("Subodh2");
	set3.add("Deep2");
	
	System.out.println(set );
	System.out.println(set1);
	System.out.println(set3);
	
	Set<String>set4=new HashSet<>(set);
	System.out.println("set4");
	System.out.println(set4);
	
	set4.addAll(set3);
	System.out.println(set4);
	
	set4.retainAll(set3);
	System.out.println(set4);
	
	set4.removeAll(set3);
	System.out.println(set4);
}
}

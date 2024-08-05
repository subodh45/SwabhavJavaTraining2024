package com.Aurionpro.Set.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
public static void main(String[] args) {
	
	Map<String,Integer>map=new HashMap<String,Integer>();
	Map<String,Integer>map2=new TreeMap<String,Integer>();
	
	map.put("A",100);
	map.put("B",150);
	map.put("C",140);
	map.put("D",110);
	map.put("A",120);
	
	System.out.println(map);
	
	map.putIfAbsent("A",111);
	map.put(null,112);
	map.put(null,124);
	
	System.out.println(map);
	
	map2.put("A",100);
	map2.put("B",150);
	map2.put("C",140);
	map2.put("D",110);
	map2.put("A",120);
	
	//null value is not accepted by Tree Map .
	map2.putIfAbsent("A",111);
	//map2.put(null,112);
	System.out.println(map2);
	
	System.out.println( map.get("A")); 
	System.out.println( map.getClass());
	map.remove("B");
	
	System.out.println("Printing element of map one by one ");
	Set<Entry<String,Integer>> entries=map.entrySet();
	
	for(Entry<String,Integer> entry:entries)
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
		
}
}

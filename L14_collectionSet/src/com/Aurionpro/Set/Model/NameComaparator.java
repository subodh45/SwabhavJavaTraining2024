package com.Aurionpro.Set.Model;
import com.Aurionpro.Set.Model.*;

import java.util.Comparator;

public class NameComaparator implements Comparator<Student> {

		public int compare(Student student1,Student student2) {
		
		 return student1.getName().compareTo(student2.getName());		
	}	
}

package com.Aurionpro.Set.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.Aurionpro.Set.Model.*;
import com.Aurionpro.Set.Model.StudentComparator;


import com.Aurionpro.Set.Model.*;

public class StudentTest {
public static void main(String[] args) {
	
	List<Student>students=new ArrayList<Student>();
	
	students.add(new Student(1,"subodh",89));
	students.add(new Student(4,"jateen",99));
	students.add(new Student(7,"deep",97));
	students.add(new Student(3,"suhas",90));
	students.add(new Student(2,"subodh2",70));
	System.out.println("before Sort:");
	System.out.println(students);
	printStudent(students);
	Collections.sort(students, new StudentComparator.RollNumberComparator());
	System.out.println("After Sorting");
    System.out.println(students);	
    
    System.out.println("sort by name :");
    Collections.sort(students,new StudentComparator.NameComaparator());
    printStudent(students);
}

private static void printStudent(List<Student> students) {
	// TODO Auto-generated method stub
	for(Student student: students)
	{
		System.out.println(student);
	}

}
}
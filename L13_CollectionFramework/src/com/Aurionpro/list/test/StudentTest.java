package com.Aurionpro.list.test;
import java.util.*;
import com.Aurionpro.list.model.*;

public class StudentTest {
public static void main(String[] args) {
	
	List<Student>students = new ArrayList<Student>();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number of student ");
	int size =scanner.nextInt();
	
	readStudent(students,scanner,size);
		
	System.out.println("Accesing element using loop");
	for(int i=0;i<students.size();i++)
	{
		System.out.println(students.get(i));
	}
	
	System.out.println();
	System.out.println("using for each or advance for");
	for(Student student : students)
	{System.out.println(student);}
	
	System.out.println();
	System.out.println("using iterator only access in one direction ");
	Iterator<Student>studentIterator=students.iterator();
	while(studentIterator.hasNext())
	  System.out.println(studentIterator.next());
	
	System.out.println();
	System.out.println("using Listiterator can access in both direction ");
	ListIterator<Student>studentListIterator =students.listIterator();
	while(studentListIterator.hasNext())
		System.out.println(studentListIterator.next());
	
	while(studentListIterator.hasPrevious())
		System.out.println(studentListIterator.previous());
		
	
}

private static void readStudent(List<Student> students, Scanner scanner,int size) {
	// TODO Auto-generated method stub
	for(int i=0;i<size;i++)
	{
		System.out.println("enter rollnumbe of "+ (i+1)+" Student");
		int rollNumber=scanner.nextInt();
		System.out.println("enter name of "+ (i+1 )+" student");
		String name =scanner.next();
		System.out.println("enter percentage of "+ (i+1) +" student");
		double percentage = scanner.nextDouble();
		
		students.add(new Student(rollNumber,name,percentage));
	}
}

}

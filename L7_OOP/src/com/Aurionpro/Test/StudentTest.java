package com.Aurionpro.Test;
import com.Aurionpro.Model.*;

import java.util.*;

public class StudentTest {
   public static void main(String[] args) {
  
	   Scanner sc = new Scanner(System.in);
	   
	   Student s = new Student();
	   
	   System.out.println("Enter number of student ");
	   int num = sc.nextInt();
	   
	   for(int n=0;n<num;n++)
	   {
		   System.out.println("Enter  rno of student "+ (n+1)+" .");
		   int rno =sc.nextInt();
		   s.setRno(rno);
		   
		   System.out.println("Enter name  of student "+ (n+1)+" .");
		   String name =sc.next();
		   s.setName(name);
		   
		   System.out.println("Enter age of student "+ (n+1)+" .");
		   int age =sc.nextInt();
		   s.setAge(age);
		   
		   System.out.println("Enter percent of student "+ (n+1)+" .");
		   double percent =sc.nextInt();
		   s.setPercent(percent);
		   
		   System.out.println("Name : "+ s.getName());
		   System.out.println("rno: "+ s.getRno());
		   System.out.println("Age : "+ s.getAge());
		   System.out.println("Percent : "+ s.getPercent());
		   System.out.print("Grade : " +  s.Grade());
		  
		  
	   }
	   
}
}

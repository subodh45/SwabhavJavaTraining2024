package com.Aurionpro.InheritanceTest;
import com.Aurionpro.Inheritance.*;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1=new Student();
		
		student1.setName("Subodh");
		student1.setAddress("Mumbai");
		student1.setAge(23);
		student1.setRollNo(7035);
		student1.setPercentage(99);
		
		System.out.println(student1.toString()); 
	}
}

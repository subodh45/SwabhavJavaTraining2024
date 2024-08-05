package com.aurionpro.mockito;

public class Student {

	IStudentService studentService;

	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	public int Calculatepercentage()
	{
		return studentService.getTotalMarks() / studentService.getTotalNumberOfSubject();
	}
}

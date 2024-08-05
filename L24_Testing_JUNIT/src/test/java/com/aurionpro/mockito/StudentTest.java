package com.aurionpro.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {

	private IStudentService studentService;
	private Student student;
	@BeforeEach
	void init()
	{
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}
	

	@Test
	void testCalculatepercentage() {

        Mockito.when(studentService.getTotalMarks()).thenReturn(600);
        Mockito.when(studentService.getTotalNumberOfSubject()).thenReturn(10);
        
        assertEquals(60,student.Calculatepercentage());
	}

}

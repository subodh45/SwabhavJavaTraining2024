package com.Aurionpro.Model;

public class Student {
    private int rollno;
    private String name ;
    private int age;
    private double percentage;
    
    public Student()
    {
    	
    }
    
    public Student(int rollno ,String name ,int age, double percentage)
    {
    	this.rollno=rollno;
    	this.name=name;
    	this.age=age;
    	this.percentage=percentage;
    	
    }
    
    public int getRno()
    {
    	return this.rollno;
    }
    
    public String getName()
    {
    	return this.name;
    }
    
    public int getAge()
    {
    	return this.age ;
    }
    
    public double getPercent()
    {
    	return this.percentage;
    }
    
    public void setRno(int rno)
    {
    	this.rollno =rno;
    }
    
    public void setName(String name2)
    {
    	 this.name = name2;
    }
    
    public void setAge(int a)
    {
    	this.age=a ;
    }
    
    public void setPercent(double p)
    {
    	 this.percentage=p;
    }
    
    public String Grade()
    {
    	if(this.percentage >75)
    	{return "A";}
    	else if(this.percentage >60)
    	{return "B";}
    	else if(this.percentage >50)
    	{return "C";}
    	else if(this.percentage >40)
    	{return "D";}
    	else
    	{return "F";}
    	
    }
    
    public void display()
    {
    	System.out.println("name "+ this.name +'\n'+ " rno "+this.rollno+'\n'+ " Age " + this.age+'\n' +" Percent "+this.percentage);
    }
}

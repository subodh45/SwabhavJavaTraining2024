package com.Aurionpro.Inheritance;

public class Student extends Person {

	private int rollNo;
	private int percentage;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", percentage=" + percentage + ", Name=" + getName()
				+ ", Address=" + getAddress() + " Age" + getAge() + ", Class" + getClass()
				+ ", hashCode" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

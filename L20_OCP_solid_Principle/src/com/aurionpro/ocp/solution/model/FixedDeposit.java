package com.aurionpro.ocp.solution.model;

public class FixedDeposit {
	
	private int AccountNumber;
	private String name;
	private double principle;
	private int duration;
	private IFestivalInterest festival;
	
	
	public FixedDeposit(int accountNumber, String name, double principle, int duration, IFestivalInterest festival) {
		super();
		AccountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}


	public int getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrinciple() {
		return principle;
	}


	public void setPrinciple(double principle) {
		this.principle = principle;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public IFestivalInterest getFestival() {
		return festival;
	}


	public void setFestival(IFestivalInterest festival) {
		this.festival = festival;
	}
	
	
	public double calculateSimpleInterest()
	{
		return this.principle * this.duration * this.festival.getInterestRate()/100;
	}
	
	

}

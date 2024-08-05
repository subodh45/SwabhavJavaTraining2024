package com.aurionpro.ocp.violation.model;

public class FixedDeposit {
	
	private int AccountNumber;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit(int accountNumber, String name, double principle, int duration, FestivalType festival) {
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

	public FestivalType getFestival() {
		return festival;
	}

	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	
	public double getInterestrate()
	{
		if(this.getFestival().equals(FestivalType.NEWYEAR))
			return 8;
		if(this.getFestival().equals(FestivalType.DIWALI))
			return 8.5;
		if(this.getFestival().equals(FestivalType.HOLI))
			return 7.5;
		
		  return 6.5;
		
	}
	
	public double calculateSimpleInterest()
	{
		return this.principle * this.duration * this.getInterestrate()/100;
	}
	

}

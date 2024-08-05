package com.aurionpro.violation.model;

public class TaxCalculator {

	private DBLoger dbBlogger;

	public TaxCalculator(DBLoger dbBlogger) {
		super();
		this.dbBlogger = dbBlogger;
	}

	public DBLoger getDbBlogger() {
		return dbBlogger;
	}

	public void setDbBlogger(DBLoger dbBlogger) {
		this.dbBlogger = dbBlogger;
	}
	
	
	public int CaluclateTax(int amount ,int rate)
	{
		int tax =0;
	    try {
			  tax = amount/rate;		
				}
		catch(Exception exception)
		{
			new DBLoger().log("Divideing by zero");
		}
		return tax;
	}

}

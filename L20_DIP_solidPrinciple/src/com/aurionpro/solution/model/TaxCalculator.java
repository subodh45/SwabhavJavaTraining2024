package com.aurionpro.solution.model;

import com.aurionpro.violation.model.DBLoger;

public class TaxCalculator {

	private DBLogger dbBlogger;
	private Filelogger filelogger;

	public TaxCalculator(DBLogger dbBlogger, Filelogger filelogger) {
		super();
		this.dbBlogger = dbBlogger;
		this.filelogger =filelogger;
	}

	public DBLogger getDbBlogger() {
		return dbBlogger;
	}

	public void setDbBlogger(DBLogger dbBlogger) {
		this.dbBlogger = dbBlogger;
	}
	
	public Filelogger getFilelogger() {
		return filelogger;
	}

	public void setFilelogger(Filelogger filelogger) {
		this.filelogger = filelogger;
	}

	public int CaluclateTax(int amount ,int rate)
	{
		int tax =0;
	    try {
			  tax = amount/rate;		
				}
		catch(Exception exception)
		{
			new DBLogger().log("Divideing by zero");
		}
		return tax;
	}

}

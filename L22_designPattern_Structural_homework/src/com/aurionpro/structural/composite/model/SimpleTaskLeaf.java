package com.aurionpro.structural.composite.model;

public class SimpleTaskLeaf implements ITask{

	 private String title;
	 
	    public SimpleTaskLeaf(String title) {
	        this.title = title;
	    }
	 
	    @Override
	    public String getTitle() {
	        return title;
	    }
	 
	    @Override
	    public void setTitle(String title) {
	        this.title = title;
	    }
	 
	    @Override
	    public void display() {
	        System.out.println("Simple Task: " + title);
	    }
}

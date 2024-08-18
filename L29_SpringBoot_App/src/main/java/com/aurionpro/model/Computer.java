package com.aurionpro.model;

public class Computer {

	private String name;
	private Harddisk harddisk;
	
	public Computer()
	{
		System.out.println("inside computer ");
	}

	public Computer(String name, Harddisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Harddisk getHardDisk() {
		return harddisk;
	}

	public void setHardDisk(Harddisk harddisk) {
		System.out.println("inside com setter ");
		this.harddisk = harddisk;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", disk=" + harddisk + "]";
	}
	
	
}

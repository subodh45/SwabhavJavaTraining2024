package com.aurionpro.guitar.model;

public class GuitarSpec {

	private Builder builder;
	private String model;
	private int numString;
	private Type type;
	private Wood  backWood;
	private Wood topWood;
	
	public GuitarSpec(Builder builder, String model, int numString,Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.numString=numString;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public int getNumString() {
		return numString;
	}

	public void setNumString(int numString) {
		this.numString = numString;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	
	public boolean matches(GuitarSpec searchGuitar)
	{
		//check builder
		//String builder = searchGuitar.getBuilder();
		if(searchGuitar.getBuilder() != this.getBuilder())
			 return false;
		
		//check model
		String model = searchGuitar.getModel().toLowerCase();
		if(model != null && !model.equals("") && !model.equals(this.getModel().toLowerCase()))
			return false;
		
		//check numString
	   //String type = searchGuitar.getType();
				if(searchGuitar.getNumString() != this.getNumString())
					return false;
		
		//check type
		//String type = searchGuitar.getType();
		if(searchGuitar.getType() != this.getType())
			return false;
		
		//check backwood
		//String backwood = searchGuitar.getBackWood();
		if(searchGuitar.getBackWood() != this.getBackWood())
			return false;
		
		//check topwood
		//String topwood = searchGuitar.getModel();
		if(searchGuitar.getTopWood() != this.getTopWood())
			return false;
		
		return true;
	}
	
}

package com.mnbryant.twinkies;

public abstract class Ingredient {

	public Ingredient(String Name, String Source, String Desc) {
		// TODO Auto-generated constructor stub
		name = Name;
		source = Source;
		desc = Desc;
	}

	private String name;
	private String source;
	private String desc;
	
	public String getName(){
		return name;
	}
	
	public String getSource(){
		return source;
	}
	
	public String getDesc(){
		return desc;
	}
}

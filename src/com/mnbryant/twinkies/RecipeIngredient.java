package com.mnbryant.twinkies;

public class RecipeIngredient {

	public RecipeIngredient(double Amount, String M, String Name){
		name = Name;
		measurement = M;
		amount = Amount;
	}

	private String name;
	private String measurement;
	private double amount;
	
	public String getName(){
		return name;
	}
	
	public String getMeasurement(){
		return measurement;
	}
	
	public double getAmount(){
		return amount;
	}
}

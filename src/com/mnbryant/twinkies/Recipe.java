package com.mnbryant.twinkies;

import libs.Out;

public abstract class Recipe {

	public Recipe(String Name, String[] Steps, RecipeIngredient[] Ingredients) {
		name = Name;
		steps = Steps;
		ingredients = Ingredients;
	}

	protected String name;
	protected String[] steps;
	protected RecipeIngredient[] ingredients;
	
	private void printIngredientsList(){
		Out.NewLine();
		for (int i = 0; i < ingredients.length; i++) {
			StringBuilder str = new StringBuilder();
			str.append((i+1)+") ");
			if (ingredients[i].getAmount() != 0){
				str.append(ingredients[i].getAmount());
				str.append(" ");
			}
			if (!ingredients[i].getMeasurement().equals("")){
				str.append(ingredients[i].getMeasurement());
				str.append(" of ");
			}
			str.append(ingredients[i].getName());
			Out.Print(str.toString());
		}
	}
	
	public String getName(){
		return name;
	}
	
	private void printSteps(){
            Out.NewLine();
            for (int i = 0; i < steps.length; i++) {
                Out.Print((i+1)+") "+steps[i]);
                Out.NewLine();
            }
	}
	
	public void printRecipe(){
		Out.Print(name.toUpperCase()+":");
		Out.NewLine();
		Out.Print("INGREDIENTS:");
		printIngredientsList();
		Out.NewLine();
		printSteps();
		Out.NewLine();
	}
		
}

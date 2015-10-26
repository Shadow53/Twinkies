package com.mnbryant.twinkies.recipes;

import com.mnbryant.twinkies.Recipe;
import com.mnbryant.twinkies.RecipeIngredient;

public class HomemadeTwinkies extends Recipe {

	public HomemadeTwinkies(String Name, String[] Steps, RecipeIngredient[] Ingredients) {
		super(Name, Steps, Ingredients);
		// TODO Auto-generated constructor stub
	}

	public HomemadeTwinkies(){
		super("Homemade Twinkies", null, null);
		
		this.steps = new String[] {
				"Preheat oven to 325 degrees Fahrenheit.",
				"Fold each piece of aluminum foil in half twice. Wrap the folded foil around the spice bottle to create a mold. Leave the top of the mold open for pouring in the batter. Make ten of these molds and arrange them on a cookie sheet or in a shallow pan. Grease the inside of each mold with a light coating of nonstick spray.",
				"Disregard the directions on the box of cake mix. Instead, beat the egg whites until stiff. In a separate bowl combine cake mix with water, and beat until thoroughly blended (about 2 minutes). Fold egg whites into the cake batter and slowly combine until completely mixed.",
				"Pour the batter into the molds, filling each one about 3/4 of an inch. Bake in the preheated oven for 30 minutes, or until the cake is golden brown and a toothpick stuck in the center comes out clean.",
				"For the filling, combine the salt with the hot water in a small bowl and stir until salt is dissolved. Let this mixture cool.",
				"Combine the marshmallow creme, shortening, powdered sugar, and vanilla in a medium bowl and mix well with an electric mixer on high speed until fluffy.",
				"Add the salt solution to the filling mixture and combine.",
				"When the cakes are done and cooled, use a skewer or chopstick to make three holes in the bottom of each one. Move the stick around inside of each cake to create space for the filling.",
				"Using a cake decorator or pastry bag, inject each cake with filling through all three holes."
		};
		
		this.ingredients = new RecipeIngredient[] {
				new RecipeIngredient(0, "", "nonstick spray"),
				new RecipeIngredient(4, "", "egg whites"),
				new RecipeIngredient(1, "16 oz box", "golden pound cake mix"),
				new RecipeIngredient(.66, "cups", "water"),
				new RecipeIngredient(2, "teaspoons", "very hot water"),
				new RecipeIngredient(.25, "teaspoon", "salt"),
				new RecipeIngredient(2, "cups", "marshmallow creme"),
				new RecipeIngredient(.5, "cup", "shortening"),
				new RecipeIngredient(.33, "cup", "powdered sugar"),
				new RecipeIngredient(.5, "teaspoon", "vanilla")
		};
	}
}

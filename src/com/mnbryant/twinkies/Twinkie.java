package com.mnbryant.twinkies;

import com.mnbryant.twinkies.ingredients.*;
import com.mnbryant.twinkies.recipes.*;

import libs.Console;
import libs.In;
import libs.Out;
import libs.InvalidInputException;

public class Twinkie {
	
	private static Ingredient[] ingredients = new Ingredient[] {
            new EnrichedBleachedWheatFlour(), new Water(), new FolicAcid(),
            new Niacin(), new ThiamineMononitrate(),
            new Riboflavin(), new  CornSyrup(),
            new HighFructoseCornSyrup(), new VegetableAndOrAnimalShortening(), new Whey(), new SoyLecithin(),
            new Glycerin(), new Salt(), new Dextrose(), new Egg(),
            new ModifiedCornStarch(), new Yellow5(),
	};
	
	private static HomemadeTwinkies twinkies = new HomemadeTwinkies();
	
	public static void main(String[] args) {
		Welcome();
		Choose();
	}
	
	private static void Logo(){
		Console.clearConsole();
		Out.Print(new String[]{
                    "   ______         _       __   _          ",
                    "  /_  __/      __(_)___  / /__(_)__  _____",
                    "   / / | | /| / / / __ \\/ //_/ / _ \\/ ___/",
                    "  / /  | |/ |/ / / / / / ,< / /  __(__  ) ",
                    " /_/   |__/|__/_/_/ /_/_/|_/_/\\___/____/  "
		});

		Out.NewLine();
	}

	private static void Welcome(){
		Logo();
		Out.Print(new String[]{
                    "Welcome to Michael's project on Twinkies. This program explores one of the most famous items of junk food in America: the Hostess Twinkie.",
                    "The primary purpose of this program is to explore the myriad ingredients found in these sweet little cakes, though for those who love Twinkies in spite of the SCARY ingredients there are also recipes involving Twinkies, including making a homemade version.",
                    "You might find that some words are cut in the middle when they reach the edge of the window, with the latter part moved to the next line. I cannot control this, so please do not grade me down on it.",
                    ""
		});
		In.GetReady("Press <enter> to continue");
	}
	
	private static void Choose(){
		Logo();
		Out.NewLine();
		Out.Print(new String[]{
                    "What would you like to do?",
                    "1) View the SCARY ingredients",
                    "2) Make your own Twinkies!",
                    "3) Learn about the Twinkie Defense",
                    "4) Play Credits (View sources)",
                    "5) Quit",
                    ""
		});
		
		try {
			int choice = In.GetInteger();
			switch (choice){
			case 1:
				ViewIngredients();
				break;
			case 2:
				ReadRecipes();
				break;
			case 3:
				ReadTwinkieDefense();
				break;
			case 4:
				Logo();
				Credits.Play();
				Choose();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				Out.Print("I didn't understand your choice. Please enter 1, 2, or 3 for your choice.");
				Out.NewLine();
				Choose();
			}
		}
		catch (InvalidInputException e){
			Out.Print("I'm sorry, that wasn't an option. Please select a different item.");
			Out.NewLine();
			Choose();
		}
		
	}

	private static void ReadTwinkieDefense() {
		Logo();
		TwinkieDefense.print();
		Out.NewLine();
		In.GetReady("Press <enter> to return to the main menu");
		Choose();
	}

	private static void ReadRecipes() {
		Logo();
		twinkies.printRecipe();
		Out.NewLine();
		In.GetReady("Press <enter> to go back to the main menu.");
		Choose();
	}

	private static void ViewIngredients() {
		Logo();
		for (int i = 0; i < ingredients.length; i++) {
			Out.Print((i+1)+") " + ingredients[i].getName());
		}
		Out.NewLine();
		Out.Print((ingredients.length + 1) + ") Back to main menu");
		
		Out.NewLine();
		try {
			int choice = In.GetInteger("Which ingredient would you like to view?");
			Out.NewLine();
			if (choice > 0 && choice < (ingredients.length + 1)){
				Logo();
				int i = choice - 1;
				Out.Print(ingredients[i].getName().toUpperCase()+":");
				Out.NewLine();
				Out.Print(ingredients[i].getSource());
				if (!ingredients[i].getDesc().equals("")){
					Out.NewLine();
					Out.Print(ingredients[i].getDesc());
				}
			}
			else if (choice == (ingredients.length + 1)){
				Choose();
			}
			else {
				Out.Print("I'm sorry, that wasn't an option. Please select a different item.");
				ViewIngredients();
			}
			try {
				Out.NewLine();
				boolean viewIngredient = In.GetBoolean("Would you like to read about another ingredient? [y/n]");
				if (viewIngredient){
					ViewIngredients();
				}
				else {
					Choose();
				}
			}
			catch (InvalidInputException e){
				Out.Print("I could not understand your choice. Taking you to the main menu.");
				Choose();
			}
			
		}
		catch (InvalidInputException e){
			Out.Print("I didn't understand your choice. Please make a new selection.");
			ViewIngredients();
		}
	}
}

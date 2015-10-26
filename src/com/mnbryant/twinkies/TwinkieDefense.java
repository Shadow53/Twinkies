package com.mnbryant.twinkies;

import libs.Out;

public class TwinkieDefense {

	private static String title = "The (Infamous) Twinkie Defense";
	
	private static String desc = "The \"twinkie defense\" is a term that came about after the trial of Dan White in 1979. A twinkie defense is one where the defendant claims to have been under \"diminished capacity\", a term meaning that they did not fully understand their own actions or the consequences.\n"
			+ "Many people think that White's lawyers had claimed that Twinkies had driven him insane on the night in question, when he shot and killed two San Francisco politicians. According to WiseGeek, the actual defense was that White, a man normally into healthy foods, had been eating junk food in the months leading up to the murder. This defense was offered as an illustration of how depressed he had been.";
	
	public static void print(){
		Out.Print(title);
		Out.NewLine();
		Out.Print(desc);
	}
}
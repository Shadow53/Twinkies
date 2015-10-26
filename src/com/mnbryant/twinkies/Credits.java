package com.mnbryant.twinkies;

import libs.Out;

public class Credits {

	public Credits() {
		// TODO Auto-generated constructor stub
	}
	private static final String[] sources = new String[] {
		"ENRICHED BLEACHED WHEAT FLOUR",
		"http://lifehacker.com/know-the-difference-between-whole-wheat-and-enriched-wh-472997429",
		"http://www.wisegeek.com/what-is-chlorine-gas.htm",
		"http://www.livestrong.com/article/533356-nutrition-of-bleached-vs-unbleached-flour/",
		"",
		"FOLIC ACID",
		"https://www.nlm.nih.gov/medlineplus/ency/article/002408.htm",
		"http://www.hsph.harvard.edu/nutritionsource/folic-acid/",
		"",
		"NIACIN",
		"http://www.webmd.com/vitamins-supplements/ingredientmono-924-NIACIN%20AND%20NIACINAMIDE%20VITAMIN%20B3.aspx?activeIngredientId=924&activeIngredientName=NIACIN%20AND%20NIACINAMIDE%20VITAMIN%20B3",
		"",
		"THIAMINE MONONITRATE",
		"http://www.livestrong.com/article/313249-the-side-effects-of-thiamine-mononitrate/",
		"",
		"RIBOFLAVIN",
		"https://www.nlm.nih.gov/medlineplus/ency/article/002411.htm",
		"http://umm.edu/health/medical/altmed/supplement/vitamin-b2-riboflavin",
        "",
		"SUGAR",
        "http://science.howstuffworks.com/innovation/edible-innovations/sugar4.htm",
        "",
        "CORN SYRUP",
        "http://www.wisegeek.com/what-is-corn-syrup.htm",
        "http://www.thekitchn.com/corn-syrup-vs-highfructose-corn-syrup-there-is-a-difference-196819",
		"",
        "HIGH FRUCTOSE CORN SYRUP",
		"http://www.fda.gov/Food/IngredientsPackagingLabeling/FoodAdditivesIngredients/ucm324856.htm",
		"http://www.thekitchn.com/corn-syrup-vs-highfructose-corn-syrup-there-is-a-difference-196819",
        "",
        "VEGETABLE SHORTENING",
        "http://www.food.com/about/shortening-430",
        "http://www.wisegeek.com/what-is-hydrogenated-fat.htm",
        "http://www.heart.org/HEARTORG/GettingHealthy/NutritionCenter/HealthyEating/Trans-Fats_UCM_301120_Article.jsp#.Vh6OvOBVG00",
        "",
        "ANIMAL SHORTENING",
        "",
        "WHOLE EGG",
        "http://ag.ansc.purdue.edu/poultry/publication/commegg/",
        "",
        "DEXTROSE",
        "http://www.livestrong.com/article/274155-what-is-dextrose-in-food/",
        "",
        "MODIFIED CORN STARCH",
        "http://www.whatisthatingredient.com/ingredient.php?id=29",
        "http://www.celiac.com/gluten-free/topic/1579-modified-corn-starch/",
        "",
        "WHEY",
        "http://www.wisegeek.com/what-is-whey.htm",
        "",
        "SOY LECITHIN",
        "http://www.huffingtonpost.com/amanda-greene/soy-lecithin-why-is-it-in_b_2891780.html",
        "http://www.soyconnection.com/sites/default/files/Soy-Lecithin-Fact-Sheet.pdf",
        "",
        "SOYBEAN OIL",
        "",
        "",
        "GLYCERIN",
        "http://www.wisegeek.com/what-is-glycerin.htm",
        "http://www.ehow.com/list_7341516_foods-containing-glycerin.html",
        "http://www.livestrong.com/article/333686-foods-containing-glycerin/",
        "",
        "SALT",
        "http://www.mortonsalt.com/salt-facts/salt-production-and-processing",
        "http://www.wisegeekhealth.com/what-is-sodium-chloride.htm",
        "http://www.wisegeek.com/what-is-iodized-salt.htm",
        "",
        "YELLOW 5",
        "http://www.thefreedictionary.com/Azo+dyes",
        "http://www.ncbi.nlm.nih.gov/pubmed/2239641",
        "",
        "RED 40",
        "http://www.forbes.com/sites/rachelhennessey/2012/08/27/living-in-color-the-potential-dangers-of-artificial-dyes/",
        "",
		"RECIPES",
		"http://www.topsecretrecipes.com/Hostess-Twinkie-Copycat-Recipe.html",
		"",
		"TWINKIE DEFENSE",
		"http://www.wisegeek.com/what-is-a-twinkie-defense.htm"
	};
	
	public static final void Play(){
		for (int i = 0; i < sources.length; i++) {
			try {
				Out.Print(sources[i]);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Out.Print("Something broke mah program! DX");
				e.printStackTrace();
			}
		}
	}
}

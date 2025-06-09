package current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.TeaExample;

public class BikeCake {
	public static void main(final String[] args) {
		final DrinkFactory drinkTea = getDrinkFactoryByName("cofFee");
		final DrinkFactory drinkLemonade = getDrinkFactoryByName("lemonade");
		final Drink lemonade = drinkLemonade.createDrink();
		final Drink tea = drinkTea.createDrink();
		tea.getDrink();
		lemonade.getDrink();
	}

	static DrinkFactory getDrinkFactoryByName(final String name) {
		return switch (name.toLowerCase()) {
			case "coffee" -> new CoffeeFactory();
			case "tea" -> new TeaFactory();
			case "lemonade" -> new LemonadeFactory();
			default -> throw new RuntimeException("We don't have this type of drink!");
		};
	}
}

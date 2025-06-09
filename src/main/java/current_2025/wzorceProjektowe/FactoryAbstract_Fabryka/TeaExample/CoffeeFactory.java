package current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.TeaExample;

public class CoffeeFactory implements DrinkFactory {
	@Override
	public Drink createDrink() {
		return new Coffee();
	}
}

package wzorceProjektowe.FactoryAbstract_Fabryka.TeaExample;

public class LemonadeFactory implements DrinkFactory {
	@Override
	public Drink createDrink() {
		return new Lemonade();
	}
}

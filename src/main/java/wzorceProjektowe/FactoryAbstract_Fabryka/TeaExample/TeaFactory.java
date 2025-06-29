package wzorceProjektowe.FactoryAbstract_Fabryka.TeaExample;

public class TeaFactory implements DrinkFactory {
	@Override
	public Drink createDrink() {
		return new Tea();
	}
}

package current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.TeaExample;

public class TeaFactory implements DrinkFactory {
	@Override
	public Drink createDrink() {
		return new Tea();
	}
}

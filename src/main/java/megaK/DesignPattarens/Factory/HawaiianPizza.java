package megaK.DesignPattarens.Factory;

public class HawaiianPizza implements Pizza {
	@Override
	public String whatSauce() {
		return "Tomato";
	}

	@Override
	public void bake() {
		System.out.println("I'm soo baking my pineapple!");
	}

	public void morePineapple() {
		System.out.println("More pineapple!");
	}
}

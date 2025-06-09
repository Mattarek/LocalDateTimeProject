package megaK.podsumowanie.example2;

public class Cyclist<T> implements Bikeable<String> {
	@Override
	public void ride(final String bike) {
		System.out.println("I'm riding a bike from company " + bike);
	}
}

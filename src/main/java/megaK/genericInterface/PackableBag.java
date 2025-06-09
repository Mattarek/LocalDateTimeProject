package megaK.genericInterface;

public class PackableBag implements Packable<Car> {
	@Override
	public void pack(final Car element) {
	}

	@Override
	public Car empty() {
		return null;
	}
}

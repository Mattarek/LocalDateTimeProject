package old_2024.GarbageCollectorTest;

public class GCTEST {
	public static int itemsSold;
	public String model;

	public GCTEST(final String model) {
		this.model = model;
		++itemsSold;
	}
}

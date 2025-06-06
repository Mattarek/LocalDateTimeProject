package old_2024.GarbageCollectorTest;

public class main {

	public static void main(final String[] args) {
		GCTEST gct = new GCTEST("1");
		final GCTEST gcta = new GCTEST("a");
		final GCTEST gctb = new GCTEST("b");

		gct = null;
		System.gc();
		System.out.println(gct);
		System.out.println(GCTEST.itemsSold);
	}
}

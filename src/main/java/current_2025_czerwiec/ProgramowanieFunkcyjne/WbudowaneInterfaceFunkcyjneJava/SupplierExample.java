package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(final String[] args) {
		// Supplier - dostarczyciel,
		// - nic nie przyjmuje i zwraca ten sam typ jaki przekazaliśmy

		final Supplier<Integer> supplier1 = SupplierExample::gimme;
		final int asd = supplier1.get();
		System.out.println(asd);
	}

	private static Integer gimme() {
		return 456;
	}
}

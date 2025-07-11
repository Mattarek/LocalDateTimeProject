package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.DuzyProjekt;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer<T extends Comparable<T>> {
	public Supplier<T> getSupplierImpl(final T t) {
		return () -> t;
	}

	public Consumer<T> getConsumerImpl() {
		return (final T u) -> {
			System.out.println("Consumer: " + u);
		};
	}

	// Jeśli piszemy uniwersalną metodę, bazującą na generykach, to nie wiemy
	// co przekażemy, dlatego też operatora dodawania czy innych możemy nie mieć.
	// Wtedy musimy dać coś co jest porówynwalne, tak jak toString tutaj.
	// W tym przypadku przydatnym okazuje się nam zapis <T extends Car>,
	// wtedy zawężamy i możemy wykonać różne operacje.
	// Możemy zapisać np: public class Producer<T extends Comparable<T>>
	public Function<T, T> getFunctionImpl(final T t) {
		// Jeśli damy Producet<T>
		//		return (T u) -> u.toString().compareTo(t.toString()) > 0 ? u : t;

		// Jeśli damy Producet<public class Producer<T extends Comparable<T>>
		return u -> u.compareTo(t) > 0 ? u : t;
	}
}


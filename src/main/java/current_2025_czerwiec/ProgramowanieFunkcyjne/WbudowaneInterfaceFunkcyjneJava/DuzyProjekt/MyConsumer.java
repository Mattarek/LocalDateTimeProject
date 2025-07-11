package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.DuzyProjekt;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyConsumer {
	public void consume(final Consumer<String> c) {
		c.accept("qwe");
	}

	// Używamy <?> aby powiedzieć, żę cokolwiek, to nie jest ważne co przekaze bo i tak tylko to zwróce
	public void consume(final Supplier<?> supplier) {
		supplier.get();
	}

	public void consume(final Function<Integer, String> function) {
		System.out.println(function.apply(312));
	}
}

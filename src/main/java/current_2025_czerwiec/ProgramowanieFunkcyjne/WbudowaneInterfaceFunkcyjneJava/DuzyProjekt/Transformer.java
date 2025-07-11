package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.DuzyProjekt;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class Transformer {

	// Aby typ generyczny był tylko na metodzie, dodajemy go przed typem zwracanym:
	public static <T, R extends Number> Function<T, R> getFunctionImpl() {

		return (T t) -> (R) Integer.valueOf(t.toString().length());
	}

	// Jak idzimy, String jest klasą final, więc nie można z niej dziedziczyć
	// dlatego też InteliJ podmieni nam typ generyczny po prostu na String
	//	public static <T extends String> UnaryOperator<T> getUnaryOperatorImpl() {
	public static <T extends Number> UnaryOperator<T> getUnaryOperatorImpl() {

		return t -> (T) Integer.valueOf(t.intValue() * 2);
	}
}

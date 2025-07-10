package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Zadanie2;

import java.util.Objects;

@FunctionalInterface
public interface TripleFunction<O> {
	Integer apply(String s, Integer i, O o);
}

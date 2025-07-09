package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava;

import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(final String[] args) {
		final Caller caller = new Caller();
		final BiFunction<Table, Window, String> biFunction = caller::concat;
		System.out.println(biFunction.apply(new Table(), new Window()));
	}

	static class Table {
	}

	static class Window {
	}

	static class Caller {
		String concat(final Table tbl, final Window wnd) {
			return tbl + "#####" + wnd;
		}
	}
}

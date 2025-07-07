package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda3;

@FunctionalInterface
public interface SomeFunctionalInterface {
	boolean consume(String arg1);

	default String someDefault() {
		return "qw";
	}
}

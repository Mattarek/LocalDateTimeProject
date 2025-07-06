package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda1;

public class CheckableImpl implements Checkable {
	@Override
	public boolean myTest(final String value) {
		System.out.println("Object calling");
		return value.contains("zajavka");
	}
}

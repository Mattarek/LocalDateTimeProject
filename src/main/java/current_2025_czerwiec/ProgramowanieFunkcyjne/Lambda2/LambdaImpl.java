package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda2;

public class LambdaImpl implements Lambdable {
	@Override
	public Integer countChars(final String input, final String inputTwo) {
		return input.length() + inputTwo.length();
	}
}

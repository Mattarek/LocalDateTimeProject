package current_2025.FunctionalProgramming.OneIntro;

import org.jetbrains.annotations.NotNull;

public class CheckableImpl implements Checkable {
	@Override
	public boolean myTester(final @NotNull String value) {
		return value.contains("zajavka");
	}
}

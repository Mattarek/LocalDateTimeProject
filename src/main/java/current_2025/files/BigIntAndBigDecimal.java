package current_2025.files;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntAndBigDecimal {
	public static void main(final String[] args) {
		final BigInteger aBig = new BigInteger("12313123131231");
		System.out.println(aBig);

		final BigDecimal bDecimal = new BigDecimal("0.123214124124214421421");
		System.out.println(bDecimal);
	}
}

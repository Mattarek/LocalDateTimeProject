package old_2024.genericsExample;

import java.util.List;

public class UpperBoundExample {
	public static double sumNumbers(final List<? extends Number> list) {
		double sum = 0;
		for (final Number num : list) {
			sum += num.doubleValue();
		}
		return sum;
	}

	public static void main(final String[] args) {
		final List<Integer> integerList = List.of(1, 2, 3, 4, 5);
		final List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

		System.out.println("Suma liczb całkowitych: " + sumNumbers(integerList));
		System.out.println("Suma liczb zmiennoprzecinkowych: " + sumNumbers(doubleList));
	}
}

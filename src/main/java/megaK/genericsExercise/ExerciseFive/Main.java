package megaK.genericsExercise.ExerciseFive;

// 5. Napisz generyczną metodę statyczną, któa znajdzie maksymalną wartość w podanym przedziale wartości [start,end)
// w podanej liście. Elementy listy mogą być zarówno Integer, Long, Double oraz Float. Start oraz end mogą byćtypu
// Integer, Long Doubleo oraz Float.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

// [start,end) - mająć zakres 0 - 20, ten zapis osnacza, że interesują nas liczby od 0 do 19
public class Main {
	public static <T extends Number> Optional<T> exerciseFive(final List<T> list, final T min,
															  final T max) {
		T tempMaxValue = null;
		for (final T el : list) {
			//Operatory porównania > < >= <= możemy używać tylko do typów numerycznych czyli int,double,float
			if (el.doubleValue() >= min.doubleValue() && el.doubleValue() < max.doubleValue()) {
				if (Objects.isNull(tempMaxValue) || el.doubleValue() > tempMaxValue.doubleValue()) {
					tempMaxValue = el;
				}
			}
		}
		return Optional.ofNullable(tempMaxValue);
	}

	public static void main(final String[] args) {
		final List<Integer> intArr = List.of(1, 2, 3, 4, 5, 11, 12);
		// jeśli wartości to Long, to dopisujemy L
		final List<Long> longArr = List.of(1L, 2L, 3L, 4L, 5L, 11L, 12L, 0x7fffffffffffffffL);

		final List<Double> doubleArr = Arrays.asList(1.1, 2.1, 3.1, 4.1, 5.1, 6.1);
		final List<Float> floatArray = Arrays.asList(1.2f, 2f, 3f, 5f, 6f);

		System.out.println(exerciseFive(intArr, 0, 17));
		System.out.println(exerciseFive(longArr, 0L, 17L));
		System.out.println(exerciseFive(doubleArr, 0.0, 17.0));
		System.out.println(exerciseFive(floatArray, 0.0F, 17.0F));
	}
}

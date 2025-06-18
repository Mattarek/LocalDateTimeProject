package megaK.genericsExercise.ExerciseFour;

import old_2024.staticInheritence.A.C;

import java.util.Arrays;

public class Main {
	// 4. Napisz metodę generyczną, która w podanej tablicy będzie w stanie zamienić ze sobą elementy na dwóch
	// podanych pozycjach.

	public static void main(final String[] args) {
		final Cat[] catsArray = {new Cat("Mirek"), new Cat("Marek"), new Cat("Andrzej")};

		System.out.println(Arrays.toString(catsArray));
		System.out.println(exerciseFour(catsArray, 0, 2));
		System.out.println(Arrays.toString(catsArray));
	}

	public static <T> boolean exerciseFour(final T[] array, final int indexStart, final int indexEnd) {
		if (indexStart == indexEnd
				|| indexStart < 0
				|| indexEnd < 0
				|| indexStart >= array.length
				|| indexEnd >= array.length
		) {
			return false;
		}
		final T temp = array[indexStart];
		array[indexStart] = array[indexEnd];
		array[indexEnd] = temp;
		return true;
	}

	public static class Cat {
		private final String name;

		public Cat(final String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Cat{" +
					"name='" + name + '\'' +
					'}';
		}
	}
}

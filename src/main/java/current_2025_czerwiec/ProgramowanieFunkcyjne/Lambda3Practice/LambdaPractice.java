package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda3Practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LambdaPractice {
	public static void main(final String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		final Cat cat = new Cat("Mrukson");
		final Constructor<?>[] constructors = cat.getClass().getConstructors();
		final Field[] fields = cat.getClass().getFields();
		final Field[] declaredFields = cat.getClass().getDeclaredFields();
		final Method[] methods = cat.getClass().getMethods();

		final Method[] declaredMethods = cat.getClass().getDeclaredMethods();
		System.out.println(declaredMethods[0].invoke(cat));

		//		System.out.println(Arrays.toString(constructors));
		//		System.out.println(Arrays.toString(fields));
		//		System.out.println(Arrays.toString(methods));
	}

	static class Cat {
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

		public String getName() {
			return name;
		}
	}
}

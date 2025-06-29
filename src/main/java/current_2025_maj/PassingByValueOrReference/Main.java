package current_2025_maj.PassingByValueOrReference;

// Zmienne i obiekty w Javie zawsze przekazywane są przez wartość (pass by value).
// Przekazanie obiektu do metody foo, która podmienia wartosci nie podmieni wartości.

// Jeśli chcemy zaktualizować wartość obiektu, musimy zwrócić nowy obiekt
//public static Dog foo(Dog d) {
//	d.getName().equals("Max"); // true
//	// change d inside of foo() to point to a new Dog instance construct red with name member variable set to "Fifi"
//	d = new Dog("Fifi");
//	d.getName().equals("Fifi"); // true
//	return d;
//}

public class Main {
	public static void main(final String[] args) {
		final Dog aDog = new Dog("Max");
		final Dog oldDog = aDog;

		// we pass the object to foo
		foo(aDog);
		// aDog variable is still pointing to the "Max" dog when foo(...) returns
		aDog.getName().equals("Max"); // true
		aDog.getName().equals("Fifi"); // false
		final boolean result = aDog == oldDog; // true
		//		System.out.println("without foo: " + aDog);
	}

	public static void foo(Dog d) {
		d.getName().equals("Max"); // true
		// change d inside of foo() to point to a new Dog instance construct red with name member variable set to "Fifi"
		d = new Dog("Fifi");
		d.getName().equals("Fifi"); // true
	}
}

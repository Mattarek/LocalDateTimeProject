package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.DuzyProjekt;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
	/*
	Napisz program, w którym zdefiniujesz klasę Producer, która będzie w stanie dostarczać implementację
	interfejsów funkcyjnych takich jak: Supplier, Consumer oraz Function. Zaimplementuj każdy, ze wspomnianych
	interfejsów funkcyjnych przy wykorzystaniu lambdy oraz wykonaj na nich dedykowaną dla nich metodę.

	Utwórz klasęTransformer, która będzie w stanie zwrócić implementacjęinterfejsów funkcyjnych (Function,
	UnaryOperator), które pozwolą nam transformować dae w metodach .map(), które są dostępne w klasie Optional.

	Na koniec stwórz klasę MyConsumer, która zdefiniuje metody, będące w stanie przyjąć jako argumenty interfejsy
	funkcyjne takie jak: Consumer, Supplier oraz Function, a następnie wydrukować na ekran wartości zwrócone przez
	metody wywołane na tych interfejsach funkcyjnych.
	*/

	public static void main(final String[] args) {
		// Part 1:
		//		final Producer<String> myProducer = new Producer<>();
		//		final Supplier<String> mySupplier = myProducer.getSupplierImpl("my awesome string");
		//		final String a = mySupplier.get();
		//		System.out.println(a);
		//
		//		myProducer
		//				.getConsumerImpl()
		//				.accept("qwe");// Faktyczne wywołanie lambdy występuje podczas użycia accept
		//
		//		System.out.println(myProducer.getFunctionImpl("String4").apply("String2"));

		// Part 2:
		//		final Function<String, Integer> myFunction = Transformer.getFunctionImpl();
		//
		//		//Optional.of("myStrring").map(myFunction) - to opakowane i bezpieczne przekazanie
		//		// "myStrring do myFunction. W Przypadku jesli nasza wartość to null, nie poleci NullPointerException.
		//		// Co dzieje się w mapie krok po kroku:
		//		//	1. Tworzysz Optional<String> z "myStrring".
		//		//	2. Wewnątrz .map(...) przekazujesz "myStrring" do myFunction.
		//		//	3. Wynik myFunction.apply("myStrring") == 9 jest opakowany z powrotem w Optional<Integer>.
		//		final Optional<Integer> myOptional = Optional.of("myStrring").map(myFunction);
		//		final Integer myTest = myFunction.apply("myStrring");
		//		System.out.println(myTest);
		//		System.out.println(myOptional);
		//
		//		final UnaryOperator<BigDecimal> myUnaryOperator = Transformer.getUnaryOperatorImpl();
		//		final Optional<BigDecimal> myResult = Optional.of(BigDecimal.valueOf(3.14)).map(myUnaryOperator);
		//		// Mamy t.intValue, więc mamy 3.14 skrócone na inta, więc na 3 * 2;
		//		System.out.println(myResult);

		// Part 3:
		final MyConsumer myConsumer = new MyConsumer();
		myConsumer.consume((Consumer<String>) System.out::println);
		myConsumer.consume(() -> "123");
		myConsumer.consume((Function<Integer, String>) Object::toString);
	}
}

package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.DuzyProjekt;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
	/*
	Napisz program, w którym zdefiniujesz klasę Producer, która będzie w stanie dostarczać implementację
	interfejsów funkcyjnych takich jak: Supplier, Consumer oraz Function. Zaimplementuj każdy, ze wspomnianych
	interfejsów funkcyjnych przy wykorzystaniu lambdy oraz wykonaj na nich dedykowaną dla nich metodę.

	Utwórz klasęTransformer, która będzie w stanie zwrócić implementacjęinterfejsów funkcyjnych (Function,
	UnaryOperator), które pozwolą nam transformować dae w metodach .map(), które są dostępne w klasie Optional.

	Na koniec stwórz klasę MyConsumer, która zdefiniuje metody, będące w stanie przyjąć jako argumenty interfejsy
	funkcyjne takie jak: Consumer, SUpplier oraz Function, a następnie wydrukować na ekran wartości zwrócone przez
	metody wywołane na tych interfejsach funkcyjnych.
	*/

	public static void main(final String[] args) {
		final Producer<String> myProducer = new Producer<>();
		final Supplier<String> mySupplier = myProducer.getSupplierImpl("my awesome string");
		final String a = mySupplier.get();
		System.out.println(a);

		myProducer
				.getConsumerImpl()
				.accept("qwe");// Faktyczne wywoanie lambdy występuje podczas użycia accept

		System.out.println(myProducer.getFunctionImpl("String4").apply("String2"));
	}
}

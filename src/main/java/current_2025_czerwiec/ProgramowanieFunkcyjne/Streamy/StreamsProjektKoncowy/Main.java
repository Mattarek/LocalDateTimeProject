package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.StreamsProjektKoncowy;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	static final Integer CURRENT_YEAR = 2020;

	public static void main(final String[] args) {
		// Unikalne usuwamy duplikaty, tak aby zebrać listę użytkowników.
		final List<Client> list = DataFactory.produce().stream()
				.map(Purchase::getBuyer)
				.distinct() // działa ponieważ w DataFactory mamy stałe referencje:
				//		final Client client0 = new Client("client0", "Roman", "Kowalski", BigInteger.valueOf(65814267854L), "Poznań");
				//		final Client client1 = new Client("client1", "Karolina", "Nowak", BigInteger.valueOf(66060897231L), "Warszawa");
				//		final Product product0 = new Product("product0", "Doniczka", Product.Category.GARDEN, new Money(new BigDecimal("15.99"), Money.Currency.PLN));
				//		final Product product1 = new Product("product1", "Lampa", Product.Category.GARDEN, new Money(new BigDecimal("18.99"), Money.Currency.PLN));
				//		final Product product2 = new Product("product2", "Grill", Product.Category.GARDEN, new Money(new BigDecimal("12.99"), Money.Currency.EUR));
				.toList();

		// Osoby które zapłaciły blikiem
		final List<Purchase> payment = DataFactory.produce().stream()
				.filter(purchase -> Purchase.Payment.BLIK.equals(purchase.getPayment()))
				.toList();

		// Osoby które zapłaciły Kartą kredytową
		final Long count =
				DataFactory.produce().stream()
						.distinct()
						.filter(client -> Purchase.Payment.CREDIT_CARD.equals(client.getPayment()))
						.count();

		// Oblicz jaka ilość zakupów zostaka wykonana w walucie EURO.
		//		System.out.println(list);
		final long purchaseCount = DataFactory.produce().stream()
				.filter(p -> Money.Currency.EUR.equals(p.getProduct().getPrice().getCurrency()))
				.count();

		// 5. Oblicz ile unikalnych kupionych produktów zostało zakupionych w EURO.
		final List<Product> list1 = DataFactory.produce().stream()
				.map(Purchase::getProduct)// Wyciągamy tylko elementy z product
				.distinct() // usuwa elementy na podstawie equals i hashCode
				.filter(p -> Money.Currency.EUR.equals(p.getPrice().getCurrency()))
				.toList();

		// 6. Oblicz ile PLN wydała w sklepie każda z osób które dokonał u nas zakupu. Uwzględnij tylko zakupy w PLN.
		final List<Purchase> purchaseList = DataFactory.produce();

		// Najlepiej jest używać Stringów, w przypadku klasy, mogą powstać dziwne odhyły przez to że ktos coś zapomniał
		final Map<String, BigDecimal> clientListMap = purchaseList.stream()
				.filter(p -> Money.Currency.PLN.equals(p.getProduct().getPrice().getCurrency()))
				.collect(Collectors.groupingBy(
						p -> p.getBuyer().getId(),
						TreeMap::new,
						Collectors.mapping(
								purchase -> purchase.getProduct().getPrice().getValue().multiply(BigDecimal.valueOf(purchase.getQuantity())),
								Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))
				));

		//		PrintingUtils.printingMap(clientListMap);

		// 7. Przygotuj metodę, która przyjmie konkretną kategorię i dla tej kategorii zwróci mapę,
		//		gdzie kluczem będzie id klienta, a wartością ilość kupionych przez niego produktów
		//		z podanej kategorii (weź pod uwagę tylko transakcje, w których ilość kupionych produktów jest większa
		//		niż 1).
		final List<Purchase> purchaseList1 = DataFactory.produce();
		final Map<String, ? extends Number> categoryStats = getCategoryStats(Product.Category.HOBBY, purchaseList1);
		//		PrintingUtils.printingMap(categoryStats);

		// 8. Każde zamówienie początkowo ma status PAID. Zaktualizuj status wszystkich zamówień, wykorzystująć
		// sprawdzenie satusu każdego konkretnego zamówienia wykorzystująć kod klasy OrderService podany niżej.
		// Aby sprawdzić status każdego zamówienia wykorzystaj kod klasy OrderService podany poniżej.
		// Na koniec oblicz ile zamówień zostało przetworzonych, czyli status DONE.

		// forEacha zwykle używa się, aby coś wyświetlić, a raczej do wyświetlenia wszystkich elementów.
		// Możemy zmodyfikować niż istniejącą już wcześniej tablice ale lepiej jest zwracać nowa z zmienionymi
		// wartościami, aby nie modyfikować starej.
		final Map<Purchase.Status, List<Purchase>> collect = DataFactory.produce().stream()
				.map(p -> new Purchase(p, OrderService.checkOrderStatus(p)))
				.collect(Collectors.toMap(
						Purchase::getStatus,
						List::of,
						(List<Purchase> cL, List<Purchase> nL) -> Stream.concat(cL.stream(), nL.stream()).collect(Collectors.toList()))
				);
		//		System.out.println(collect);

		// 9. Oblicz ilu unikalnych klientów kupiło produkt wyceniony w EUR (klienci nie mogą się powtarzać,
		// pamiętaj, że jeden mógł kupic kilka produktów).
		// Dodatkowo uzyskaj mapę w której kluczem jest id klienta, a wartością lista zakupów, produktów tego klienta
		// w EURO.
		final List<Purchase> count1 = DataFactory.produce().stream()
				.filter(p -> Money.Currency.EUR.equals(p.getProduct().getPrice().getCurrency()))
				.collect(Collectors.toList());

		final Map<String, List<Purchase>> purchasesInEurByClient = count1.stream().collect(Collectors.groupingBy(
				p -> p.getBuyer().getId()
		));

		//		PrintingUtils.printingMap(purchasesInEurByClient);
		// 10. Przygotuj mapę, gdzie kluczem będzie rocznik klienta, a wartościami, lista wszystkich produktów
		// jakie klient z danego rocznika kupił. Rocznik weźz numeru PESEL, nie musi być to pełne 1987, może
		// być przykładowo 87 (na potrzeby tegozadania upraszczamy model świata). Posortuj mapę po kluczu rosnąco.
		// masz już purchaseList
		final Map<Integer, List<Product>> uniqueClients = purchaseList.stream()
				.collect(Collectors.groupingBy(
						p -> p.getBuyer().getYearOfBirth(),
						TreeMap::new,
						Collectors.mapping(Purchase::getProduct, Collectors.toList())
				));
		//		PrintingUtils.printingMap(uniqueClients);

		// 11. Stwórz mapę, gdzie kluczem będą roczniki, a wartością unikalną zestaw kategorii produktów kupionych
		// prze dany rocznik.
		final Map<Integer, Set<Product.Category>> collect1 = DataFactory.produce().stream()
				.collect(Collectors.toMap(
								(Purchase p) -> p.getBuyer().getYearOfBirth(),
								p -> Set.of(p.getProduct().getCategory()),
								(curr, next) -> Stream.concat(curr.stream(), next.stream())
										.collect(Collectors.toSet())
						)
				);

		//System.out.println(collect1);

		// 12. Jaki jest drugi najczęściej kupowany produkt? Jeżeli kilka produktów jest kupionych w takiej same
		// ilości, posortuj je alfabetycznie po id i nadal weź drugi. Czyli sortujesz najpierw po największej ilości
		// wystąpień danego produktu, a potem po id.
		final Map<String, Long> collectTuple = DataFactory.produce().stream()
				.collect(
						Collectors.groupingBy(
								p -> p.getProduct().getId(),
								TreeMap::new,
								Collectors.mapping(
										Purchase::getQuantity,
										Collectors.reducing(0L, Long::sum)
								)
						));
		//		PrintingUtils.printingMap(collectTuple);

		final Comparator<? super Pair<String, Long>> pairComparator =
				Comparator.comparing((Pair<String, Long> a) -> a.getV())
						.reversed()
						.thenComparing(Pair::getU);

		final Pair<String, Long> aDefault = collectTuple.entrySet().stream()
				.map(e -> new Pair<>(e.getKey(), e.getValue()))
				.sorted(pairComparator)
				.skip(1)
				.findFirst()
				.orElse(new Pair<>("Default", 0L));

		//		System.out.println(aDefault);

		// 13. Dla ludzi starszych niz 50lat, stwórz strukturę, w której zawrzesz informacje:
		//	rocznik, najmniej popularna kategoria dla danego rocznia, ilość transakcji dla danego rocznika w obrębie
		//	danek kategorii
		// Mówiąc najmniej popularną mamy na myśli, najmniejszą ilość dokonanych zakupów w obrębie danej kategorii,
		// np: "rocznik: 62, najmniej popularna kategoria: GAARDEN, transakcje: 5"
		final Map<Integer, Map<Product.Category, Long>> coll = DataFactory.produce().stream()
				.filter(p -> CURRENT_YEAR - (p.getBuyer().getYearOfBirth() + 1900) > 50)
				.collect(Collectors.groupingBy(
						p -> p.getBuyer().getYearOfBirth(),
						Collectors.groupingBy(
								p -> p.getProduct().getCategory(),
								Collectors.counting()
						)
				));
		//		PrintingUtils.printingMap(coll);

		// 14. Który rocznik kupił najwięcej produktów
		final List<Purchase> col = DataFactory.produce();
		final Map<Integer, Long> quantityByYear = col.stream().collect(Collectors.groupingBy(
				p -> p.getBuyer().getYearOfBirth(),
				Collectors.mapping(
						Purchase::getQuantity,
						Collectors.reducing(0L, Long::sum)
				)
		));
		final Map<Long, Set<Integer>> collect2 = quantityByYear.entrySet().stream().collect(Collectors.toMap(
				Map.Entry::getValue,
				e -> Set.of(e.getKey()),
				(currentList, nextList) -> Stream.concat(currentList.stream(), nextList.stream())
						.collect(Collectors.toSet()),
				TreeMap::new
		));

		final Map.Entry<Long, Set<Integer>> noPurchesInTheShop = collect2.entrySet().stream().max(Comparator.comparing(Map.Entry::getKey))
				.orElseThrow(() -> new RuntimeException("No purches in the shop"));
		System.out.println(noPurchesInTheShop);
	}

	//purchase.getBuyer().getYear()
	private static Map<String, ? extends Number> getCategoryStats(final Product.Category category,
																  final List<Purchase> purchases) {
		if (Objects.isNull(category)) {
			throw new RuntimeException("Provided " + category + " is null!");
		}

		return purchases.stream()
				.filter(p -> getPurchasePredicate(category, p))
				.collect(Collectors.groupingBy(
						p -> p.getBuyer().getId(),
						Collectors.mapping(
								Purchase::getQuantity,
								Collectors.reducing(0L, Long::sum)
						)
				));
	}

	private static @NotNull Boolean getPurchasePredicate(final Product.Category category, final Purchase purchase) {
		return purchase.getQuantity() > 1 && category.equals(purchase.getProduct().getCategory());
	}
}

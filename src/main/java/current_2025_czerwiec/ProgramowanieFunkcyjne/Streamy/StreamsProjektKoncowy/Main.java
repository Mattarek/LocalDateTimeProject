package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.StreamsProjektKoncowy;

import java.util.List;

public class Main {
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
		System.out.println(purchaseCount);
	}
}

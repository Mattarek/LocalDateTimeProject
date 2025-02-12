package org.OptionalExamples;

import java.util.Optional;

public class User {
	private final String name;
	private final Optional<String> phoneNumber;

	public User(final String name, final String phoneNumber) {
		this.name = name;
		this.phoneNumber = Optional.ofNullable(phoneNumber);
	}

	public static void main(final String[] args) {
		final User userOne = new User("Jan", "123456789");
		final User userTwo = new User("Anna", null);

		System.out.println(userOne.getPhoneNumber());
		System.out.println(userTwo.getPhoneNumber());

		userOne.sendSms("Hello");
		userTwo.sendSms("Hello");
	}

	public String getPhoneNumber() {
		return phoneNumber.orElse("No phone number provided");
	}

	public void sendSms(final String message) {
		phoneNumber.ifPresentOrElse(number -> System.out.println("Wysyłam SMS do " + number + ": " + message),
				() -> System.out.println("Nie można wysłać SMS - brak numeru.")
		);
	}
}

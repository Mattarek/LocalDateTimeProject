package org.Time;

import java.time.LocalDate;
import java.time.LocalTime;

public class User {
	LocalDate registerDate;
	LocalTime tokenExpired;
	String username;
	String password;

	public User(final String username, final String password) {
		this.username = username;
		this.password = password;

		final LocalDate dateNow = LocalDate.now();
		final LocalTime timeNow = LocalTime.now().plusHours(1);

		tokenExpired = timeNow;
		registerDate = dateNow;
	}

	@Override
	public String toString() {
		return "User{" +
				"registerDate=" + registerDate +
				", tokenExpired=" + tokenExpired +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}

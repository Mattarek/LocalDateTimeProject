package org.CEPiK;

import java.util.Objects;

public class RegistrationCertificate {
	private final Car car;
	private CarDriver mainDriver;
	private CarDriver additionalDriver;

	public RegistrationCertificate(final Car car) {
		this.car = car;
	}

	public void setMainDriver(final CarDriver mainDriver) {
		this.mainDriver = mainDriver;
	}

	public void setAdditionalDriver(final CarDriver additionalDriver) {
		this.additionalDriver = additionalDriver;
	}

	@Override
	public String toString() {
		return "RegistrationCertificate{}";
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final RegistrationCertificate that)) {
			return false;
		}
		return Objects.equals(car, that.car) && Objects.equals(mainDriver, that.mainDriver) && Objects.equals(additionalDriver, that.additionalDriver);
	}

	@Override
	public int hashCode() {
		return Objects.hash(car, mainDriver, additionalDriver);
	}
}

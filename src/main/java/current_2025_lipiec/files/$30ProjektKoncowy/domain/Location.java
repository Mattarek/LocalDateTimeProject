package current_2025_lipiec.files.$30ProjektKoncowy.domain;

public class Location {
	String country;
	String city;

	public Location(final String country, final String city) {
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}
}

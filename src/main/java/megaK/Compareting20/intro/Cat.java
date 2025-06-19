package megaK.Compareting20.intro;

public class Cat {
	private Integer id;
	private String name;

	public Cat(final Integer id, final String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}

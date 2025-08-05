package current_2025_lipiec.files.$22serialization;

import java.io.Serializable;

public class Dog implements Serializable {
	private static final long serialVersionUID = 1L;
	static int age = 10;

	static {
		age = 100;
		System.out.println("Calling static init block");
	}

	private transient String name = "fieldName";
	private String nickName = "fieldNickName";

	{
		this.name = "defaultName";
		this.nickName = "defaultNickName";
		System.out.println("Calling init block");
	}

	public Dog() {
		this.name = "constructorDefaultName";
		this.nickName = "constructorDefaultNickName";
		System.out.println("Calling default constructor");
	}

	public Dog(String name, String nickName) {
		this.name = name;
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", nickName='" + nickName + '\'' +
				'}';
	}
}

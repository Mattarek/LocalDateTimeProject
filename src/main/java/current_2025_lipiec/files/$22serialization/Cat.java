package current_2025_lipiec.files.$22serialization;

import java.io.Serializable;

public class Cat implements Serializable {
	static int age = 10;

	static {
		age = 100;
		System.out.println("Calling Cat static init block");
	}

	private transient String name = "fieldName";
	private String nickName = "fieldNickName";

	{
		this.name = "defaultName";
		this.nickName = "defaultNickName";
		System.out.println("Calling CAT init block");
	}

	public Cat() {
		System.out.println("Init Cat constructor.1");
	}

	public Cat(String nickName, String name) {
		this.nickName = nickName;
		this.name = name;
		System.out.println("Init Cat constructor.2");
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", nickName='" + nickName + '\'' +
				'}';
	}
}

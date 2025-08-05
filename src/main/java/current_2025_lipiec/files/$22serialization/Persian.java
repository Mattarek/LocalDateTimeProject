package current_2025_lipiec.files.$22serialization;

import java.io.Serializable;

public class Persian extends Cat implements Serializable {
	public Persian(String nickName, String name) {
		super(nickName, name);
		System.out.println("Calling Persian normal constructor");
	}

	public Persian() {
		super();
		System.out.println("Calling Persian default constructor.");
	}
}

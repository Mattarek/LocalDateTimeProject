package old_2024.StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
	List testArray = new ArrayList();

	public static void main(final String[] args) {
		final StringBuilder sb = new StringBuilder("Hello ");
		sb.append("World!");
		sb.append("It");
		sb.append("is");
		sb.append("my");
		sb.append("first");
		System.out.println(sb.substring(0, 10));
	}
}

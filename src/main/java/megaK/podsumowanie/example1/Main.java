package megaK.podsumowanie.example1;

import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final Sock<List<String>, String> sock = new Sock<>();
		System.out.println(sock.put(List.of("cash", "money")));
		System.out.println(sock.getItem());
		System.out.println(sock.put(List.of("cash2")));
		System.out.println(sock.getItem());
	}
}


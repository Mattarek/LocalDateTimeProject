package sockets.ManyClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientThird {
	public static void main(final String[] args) {
		final String host = "localhost";
		final int port = 12345;

		try (final Socket socket = new Socket(host, port);
			 final PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			 final BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 final Scanner scanner = new Scanner(System.in)) {

			System.out.println("Połączono z serwerem. Wpisz wiadomość lub 'exit' aby zakończyć:");
			String userInput;
			while (!(userInput = scanner.nextLine()).equalsIgnoreCase("exit")) {
				out.println(userInput);
				System.out.println("Serwer odpowiada: " + in.readLine());
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}

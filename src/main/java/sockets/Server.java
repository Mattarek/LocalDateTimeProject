package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(final String[] args) {
		final int port = 12345;
		try (final ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("Serwer nasłuchuje na porcie " + port);
			final Socket clientSocket = serverSocket.accept();
			System.out.println("Nowe połączenie: " + clientSocket.getInetAddress());

			final PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			final BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

			String message;
			while ((message = in.readLine()) != null) {
				System.out.println("Otrzymano: " + message);
				out.println("Serwer: Odpowiadam na wiadomość: " + message);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}

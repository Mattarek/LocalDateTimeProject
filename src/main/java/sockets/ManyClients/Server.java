package sockets.ManyClients;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(final String[] args) throws IOException {
		final int port = 12345;
		final ServerSocket serverSocket = new ServerSocket(port);
		System.out.println("Serwer nasłuchuje na porcie: " + port);

		while (true) {
			final Socket clientSocket = serverSocket.accept();
			new Thread(new ClientHandler(clientSocket)).start();
		}
	}
}

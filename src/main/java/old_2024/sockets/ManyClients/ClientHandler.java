package old_2024.sockets.ManyClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
	private final Socket socket;

	public ClientHandler(final Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (final BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 final PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

			String message;
			while ((message = in.readLine()) != null) {
				System.out.println("Otrzymano od klienta: " + message);
				out.println("Echo: " + message);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}

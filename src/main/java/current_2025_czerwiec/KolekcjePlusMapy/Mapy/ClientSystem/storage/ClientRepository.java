package current_2025_czerwiec.KolekcjePlusMapy.Mapy.ClientSystem.storage;

import current_2025_czerwiec.KolekcjePlusMapy.Mapy.ClientSystem.model.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClientRepository {
	private final Map<Integer, Client> clients = new HashMap<>();
	private final Map<String, Client> storedClients = new TreeMap<>();
	private final Map<Integer, String> operationLog = new LinkedHashMap<>();

	public void addClient(final Client client) {
		clients.put(client.getId(), client);
		storedClients.put(client.getLastName(), client);
		operationLog.put(client.getId(), "Added client: " + client.getFirstName() + " " + client.getLastName());
	}

	public Collection<Client> getAllClients() {
		return clients.values();
	}

	public Collection<Client> getClientsSortedByLastName() {
		return storedClients.values();
	}

	public Map<Integer, String> getOperationLog() {
		return operationLog;
	}
}

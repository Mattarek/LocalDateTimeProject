package current_2025_czerwiec.KolekcjePlusMapy.Compare.project8;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(final String[] args) {
		final Comparator<ServiceRequest> byPriority = Comparator.comparingInt(ServiceRequest::getPriority);

		final PriorityQueue<ServiceRequest> queue = new PriorityQueue<>(byPriority);
		queue.add(new ServiceRequest("Drukarka nie działa", 3));
		queue.add(new ServiceRequest("Serwer padł", 1));
		queue.add(new ServiceRequest("Problem z kontem", 2));

		while (!queue.isEmpty()) {
			System.out.println("Obsługiwane: " + queue.poll());
		}
	}
}

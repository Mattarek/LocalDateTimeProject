package current_2025_czerwiec.Compare.project8;

public class ServiceRequest {
	private final String description;
	private final int priority;

	public ServiceRequest(final String description, final int priority) {
		this.description = description;
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

	public String toString() {
		return "[P" + priority + "] " + description;
	}
}

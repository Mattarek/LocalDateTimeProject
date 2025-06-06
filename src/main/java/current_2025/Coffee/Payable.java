package current_2025.Coffee;

public interface Payable {
	void pay(Order order) throws EmptyOrderException;
}

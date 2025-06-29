package current_2025_maj.Coffee;

public interface Payable {
	void pay(Order order) throws EmptyOrderException;
}

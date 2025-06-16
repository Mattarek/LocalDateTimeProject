package megaK.DesignPattarens.AbstractFactory;

public interface AbstractFactory<T> {
	T create(String type); // on mówi nam jakiego typu obiekty chcemy tworzyć
}

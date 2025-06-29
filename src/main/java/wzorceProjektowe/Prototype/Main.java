package wzorceProjektowe.Prototype;

import lombok.SneakyThrows;

public class Main {
	// shallow copy - kopiuje tylko typy proste a referencje wskazują na to samo miejsce w pamięci co obiekt kopiowany
	// deep copy - kopiuje typy proste i typy złożone też w całości kopiujemy

	@SneakyThrows
	public static void main(final String[] args) {
		//		final PrototypeCar copyCar = new PrototypeCar();
		//		final SteeringWheel steeringWheel = new SteeringWheel();
		//		steeringWheel.setDiameter(10.5);
		//		copyCar.setSteeringWheel(steeringWheel);
		//
		//		final PrototypeCar shallowCopy = copyCar.shallowCopy();
		//		final PrototypeCar deepCopy = copyCar.deepCopy();
		//
		//		System.out.println("Shallow copy == " + (copyCar == shallowCopy));
		//		System.out.println("Shallow copied equals " + copyCar.equals(shallowCopy));
		//
		//		System.out.println("Shallow copied == " + (copyCar.getSteeringWheel() == shallowCopy.getSteeringWheel()));
		//		System.out.println("Shallow copied equals " + copyCar.getSteeringWheel().equals(shallowCopy.getSteeringWheel()));
		//
		//		System.out.println("Deep copied == " + (copyCar.getSteeringWheel() == shallowCopy.getSteeringWheel()));
		//		System.out.println("Deep copied equals " + copyCar.getSteeringWheel().equals(deepCopy.getSteeringWheel()));

		final PrototypeCar prototypeCar = new PrototypeCar("Ford", "Focus");
		System.out.println(prototypeCar);

		final PrototypeCar cloned = prototypeCar.clone();
		System.out.println(cloned);
	}
}

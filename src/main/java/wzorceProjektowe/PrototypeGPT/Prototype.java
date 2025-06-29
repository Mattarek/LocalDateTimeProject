package wzorceProjektowe.PrototypeGPT;

public interface Prototype<T> {
	T copy(); // zamiast clone()
}
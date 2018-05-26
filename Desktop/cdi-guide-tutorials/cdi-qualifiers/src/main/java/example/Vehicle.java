package example;

public interface Vehicle {

	static String staticMethod() {
		return "Static method.";
	};

	default String defaultMethod() {
		return "Default method.";
	};
}

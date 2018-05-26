package example;

@FunctionalInterface
public interface MyGeneric<T> {

	T compute(T t);
}

package example;

import java.util.List;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String pro = Vehicle.staticMethod();
		System.out.println(pro);
		Vehicle v = new VehicleImpl();
		String ver = v.defaultMethod();
		System.out.println(ver);

		OddEvenTest isEven = n -> (n % 2) == 0;
		OddEvenTest isOdd = n -> (n % 2) != 0;

		System.out.println(isEven.computed(5));
		System.out.println(isOdd.computed(5));

		MyGeneric<String> morning = n -> "Good morning " + n + "!";
		MyGeneric<String> evening = n -> "Good evening " + n + "!";

		System.out.println(morning.compute("giaduc"));
		System.out.println(evening.compute("giaduc"));

		MyGeneric<String> reverseString = s -> {
			String result = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				result += s.charAt(i);
			}

			return result;
		};

		System.out.println(reverseString.compute("reverse word"));

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
	}
}

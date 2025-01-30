package JavaPractice.Two;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingArrayUsingJavaCollection {
	public static void main(String[] args) {
		Integer[] a = { 1, 4, 6, 7, 8 };
		List<Integer> list = Arrays.asList(a);
		Collections.reverse(list);
		System.out.println(list);

	}
}

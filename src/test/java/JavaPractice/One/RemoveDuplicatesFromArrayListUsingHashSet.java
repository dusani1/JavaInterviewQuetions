package JavaPractice.One;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayListUsingHashSet {

	public static void main(String[] args) {

		int[] ar = { 2, 4, 23, 2, 1, 2, 3, 4, 5, 3, 3, 4, 2, 2, 1 };
		Set<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < ar.length; i++) {
			hs.add(ar[i]);

		}

		Integer[] b = hs.toArray(new Integer[hs.size()]);
		System.out.println(Arrays.toString(b));

	}
}

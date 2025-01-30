package JavaPractice.Two;

import java.util.Arrays;

public class SortingArrayElementsUsingBuildinfunctions {

	public static void main(String[] args) {
		int[] a = {23,14,2,5,1,7,34};
		System.out.println("Before sortig the array: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After sortig the array: "+Arrays.toString(a));
	}
}

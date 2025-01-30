package JavaPractice.One;

public class FindMissingElementInTheArray {
	public static void main(String[] args) {
		//int[] a = { 1, 2, 3, 4, 5, 7 };
		int[] a = { 21, 22, 23, 24, 25, 27 };

		int sumWithoutMiss = 0;
		int sumWithMiss = 0;

		for (int i = a[0]; i <= a[a.length-1]; i++) {
			sumWithoutMiss = sumWithoutMiss + i;
		}
		for (int e : a) {
			sumWithMiss = sumWithMiss + e;
		}

		System.out.println("Missing element in the array is: " + (sumWithoutMiss - sumWithMiss));

	}
}

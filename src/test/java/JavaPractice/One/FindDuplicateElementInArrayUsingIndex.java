package JavaPractice.One;

public class FindDuplicateElementInArrayUsingIndex {

	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 3, 4, 5, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i] + "is duplicated in the array");
				}
			}

		}
	}
}

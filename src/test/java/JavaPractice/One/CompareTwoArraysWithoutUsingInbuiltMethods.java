package JavaPractice.One;

public class CompareTwoArraysWithoutUsingInbuiltMethods {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 7, 9 };
		int[] b = { 1, 2, 5, 6, 7, 9 };
		boolean comparisionStatus = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					comparisionStatus = false;
					break;
				}
			}
		} else {
			comparisionStatus = false;
		}

		if (comparisionStatus)
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are not equal");

	}

}

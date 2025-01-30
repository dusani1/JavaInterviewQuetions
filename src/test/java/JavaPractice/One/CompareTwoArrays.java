package JavaPractice.One;

import java.util.Arrays;

public class CompareTwoArrays {
	public static void main(String[] args) {
		int[] a = {1,2,5,6,7,9};
		int[] b = {1,2,5,6,7,9};
		
		if(Arrays.equals(a, b))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are differnet");
	}
}

package JavaPractice.One;

import java.util.Scanner;

public class CheckStringTextIsPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String str = scanner.next();
		scanner.close();
		char[] ca = str.toCharArray();
		String reverseString = "";

		for (int i = ca.length - 1; i >= 0; i--) {
			reverseString = reverseString + ca[i];
		}

		if (str.equals(reverseString)) {
			System.out.println("Given String " + str + " is palindrome");
		} else {
			System.out.println("Given String " + str + " is not a palindrome");
		}

	}
}

package JavaMostAsked;

import java.util.Scanner;

public class FindOddOrEvenNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		scanner.close();

		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}

	}

}

package JavaMostAsked;

import java.util.Scanner;

public class NumOfDigitsInGivenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int orginalNumber = scanner.nextInt();
		scanner.close();
		int number = Math.abs(orginalNumber);// convert to positive
		int digit = 0;
		/*
		 * if (number < 0) { number = number * -1; }
		 */

		if (number == 0) {
			digit = 1;
		} else {

			while (number > 0) {
				number = number / 10;
				digit++;

			}
		}
		System.out.println("No of digits for the given number is: "+digit);

	}
}

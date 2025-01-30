package JavaPractice.One;

import java.util.Scanner;

public class CheckLeapYearOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any year: ");
		int year = scanner.nextInt();
		scanner.close();

		// logic:
		//If the year is evenly divisible by 4 and not divisible by 100, then it is a Leap year.
		//If the year is evenly divisible by both 4 and 100, then we need to check if it is evenly divisible by 400, to confirm it as Leap year.
		//If the year is not evenly divisible by 4, its not a leap year.
		//If the year is evenly divisible by both 4 and 100, and not by 400, then it is not a leap year.
		boolean isLeapYear = false;
		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {
					isLeapYear = true;
				}else {
				isLeapYear = false;
				}
			}

			isLeapYear = true;

		} else {
			isLeapYear = false;
		}

		if (isLeapYear)
			System.out.println("Given year "+year + " is Leap year");
		else
			System.out.println("Given year "+year + " is not a Leap year");

	}
}

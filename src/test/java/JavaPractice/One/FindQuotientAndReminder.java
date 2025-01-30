package JavaPractice.One;

import java.util.Scanner;

public class FindQuotientAndReminder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNum = scanner.nextInt();
		System.out.println("Enter second number");
		int secNum = scanner.nextInt();
		scanner.close();
		System.out.println("Quotient is: "+(firstNum/secNum));
		System.out.println("Reminder is: "+(firstNum%secNum));
		
	}
}

package JavaMostAsked;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		scanner.close();

		// 5 factorial = 5*4*3*2*1

		int factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;

		}

		System.out.println("Factorial of " + number + " is : " + factorial);

	}

}

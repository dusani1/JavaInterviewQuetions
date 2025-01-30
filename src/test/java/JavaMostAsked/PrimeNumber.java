package JavaMostAsked;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		scanner.close();
		// primer num should be greater than 1
		// It is not divisible by other than numbers,except 1 and itself
		boolean isPrime = true;
		
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			isPrime = false;
		}

		if (isPrime)
			System.out.println(number + " is prime number");
		else
			System.out.println(number + " is not prime number");

	}

}

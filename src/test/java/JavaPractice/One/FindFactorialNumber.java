package JavaPractice.One;

import java.util.Scanner;

public class FindFactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		int factorial = factorial(num);
		System.out.println("factorial of the given number "+ num + " is: "+factorial);
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;

		} else {
			return num * factorial(num - 1);
		}

	}
}

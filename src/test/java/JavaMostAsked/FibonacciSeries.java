package JavaMostAsked;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		scanner.close();
		// 0 1  1 2 3 5 7 9 16 25 //0 1
		fibonacciSeriesTillTheInputedNumber(number);
		fibonacciSeriesInNumberRange(number);
				

	}
	
	
	public static void fibonacciSeriesTillTheInputedNumber(int number) {
	    int firstNum = 0; // First Fibonacci number (0)
	    int secondNum = 1; // Second Fibonacci number (1)
	    
	    System.out.print(firstNum + " "+ secondNum + " "); // Print first, second term

	    int nextNum = firstNum + secondNum; // Initialize next with the sum of first two terms
	    while (nextNum <= number) { // Loop until next term exceeds 'number'
	        System.out.print(nextNum + " "); // Print the next Fibonacci number
	        firstNum = secondNum; // Shift 'firstNum' to 'secondNum'
	        secondNum = nextNum; // Shift 'secondNum' to 'nextNum'
	        nextNum = firstNum + secondNum;; // Compute next Fibonacci number
	    }
	}

	
	public static void fibonacciSeriesInNumberRange(int number) {
	    int first = 0, second = 1; // Start Fibonacci from 0,1

	    System.out.print("Fibonacci Series: " + first + ", " + second);

	    for (int i = 3; i <= number; i++) { // Loop for 'number' terms
	        int next = first + second; // Compute next Fibonacci number
	        System.out.print(" " + next);
	        first = second; // Move first to second
	        second = next; // Move second to next
	    }
	}

	
	
}

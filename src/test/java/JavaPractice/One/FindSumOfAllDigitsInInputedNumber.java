package JavaPractice.One;

import java.util.Scanner;

public class FindSumOfAllDigitsInInputedNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number");
		int number = sc.nextInt();
		sc.close();
		int sum=0;
		while(number!=0) {	
			int reminder = number % 10;
			sum = sum +reminder;
			number = number/10;
		}
		System.out.println("Sum of all the deigts is :"+ sum);
	}
	
	
}

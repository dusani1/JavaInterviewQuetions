package JavaMostAsked;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number"); 
		int originalNumber = scanner.nextInt();
		scanner.close();
		int number = originalNumber;
		int reversedNumber = 0;
		while(number > 0 ) {
			int reminder = number%10;
			reversedNumber = (reversedNumber*10)+reminder;
			number = number/10;
		}
		System.out.println("reversed number for"+number+" is: " + reversedNumber);

	
	}

}

package JavaPractice.One;

import java.util.Scanner;

public class FindNoOfDigitsInGivenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any digit number");
		int originalNum = scanner.nextInt();
		scanner.close();
		int num = originalNum;
		int countOfDigits = 0;
		while(num > 0) {
			countOfDigits++;
			num = num / 10;	
		}
		
		System.out.println(countOfDigits);
		
	}
	
}

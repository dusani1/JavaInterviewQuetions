package JavaPractice.One;

import java.util.Scanner;

public class CountTheNoOfEvenAndOddDigitsInGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit number");
		long originalNum = sc.nextLong();
		sc.close();
		long  num=originalNum;
		int countOfEvenDigits = 0;
		int coutnOfOddDigits = 0;
		
		while(num > 0) {
			long reminder = num % 10;
			
			if(reminder%2==0)
				countOfEvenDigits++;
			else 
				coutnOfOddDigits++;
			
			 num = num/10;
			
		}
			System.out.println(originalNum+" Having Even digits count: "+countOfEvenDigits+" & Odd digits count : "+ coutnOfOddDigits);
	}
}

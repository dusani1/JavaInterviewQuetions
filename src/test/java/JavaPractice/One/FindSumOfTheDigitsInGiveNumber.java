package JavaPractice.One;

import java.util.Scanner;

public class FindSumOfTheDigitsInGiveNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int originalNum = sc.nextInt();
		int num = originalNum;
		sc.close();
		int sum=0;
		while(num > 0) {
			int reminder = num %10;
			sum = sum+reminder;
			num = num/10;		
		}
		
		System.out.println("Sum of the digits of"+ originalNum + " is: "+ sum);
		
	}

}

package JavaPractice.One;

import java.util.Scanner;

public class CheckNumberIsAPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int originalNum = scanner.nextInt();
		scanner.close();
		int num = originalNum;
		int reversedNum = 0;
		
		while(num !=0) {
			int reminder = num%10;
			reversedNum = (reversedNum*10)+reminder;
			num=num/10;
	
		}
		
		if(originalNum==reversedNum) 
			System.out.println(originalNum +"is polidrome number");
		else
			System.out.println(originalNum +"is not polidrome number");
		
		
		
		
		
		
	}
	
	
}

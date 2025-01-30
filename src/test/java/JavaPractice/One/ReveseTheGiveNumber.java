package JavaPractice.One;

import java.util.Scanner;

public class ReveseTheGiveNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int originalNum = sc.nextInt();
		int num = originalNum; 
		sc.close();
		int reverseNum = 0;
		while(num > 0 ) {
			int reminder = num%10;
			reverseNum = (reverseNum*10) + reminder;
			num = num/10;		
		}
		
		System.out.println("Reverse num for the num "+originalNum + " is: "+reverseNum);
	}

}

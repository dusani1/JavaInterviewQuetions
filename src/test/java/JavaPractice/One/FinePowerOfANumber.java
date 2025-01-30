package JavaPractice.One;

import java.util.Scanner;

public class FinePowerOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int intNumber = number;
		System.out.println("Enter the power");
		int power = sc.nextInt();
		sc.close();
		for(int i=1;i<power;i++) {
			number = intNumber * number;
		}
		System.out.println("The power of "+intNumber+" is: "+number);
	}
	
}

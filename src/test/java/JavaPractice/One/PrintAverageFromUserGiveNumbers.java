package JavaPractice.One;

import java.util.Scanner;

public class PrintAverageFromUserGiveNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int firstNum = sc.nextInt();
		System.out.println("Enter second Number");
		int sectNum = sc.nextInt();
		System.out.println("Enter third Number");
		int thirdNum = sc.nextInt();
		System.out.println("Enter fourth Number");
		int fourthNum = sc.nextInt();
		System.out.println("Enter fifth Number");
		int fifthNum = sc.nextInt();
		System.out.println("Enter sixth Number");
		int sixthNum = sc.nextInt();
		sc.close();
		System.out.println("The average of above inputed 6 numbers is :"
				+ (firstNum + sectNum + thirdNum + fourthNum + fifthNum + sixthNum) / 6.0);
	}
}

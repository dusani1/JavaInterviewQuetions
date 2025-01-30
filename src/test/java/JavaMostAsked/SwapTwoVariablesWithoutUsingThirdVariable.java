package JavaMostAsked;

import java.util.Scanner;

public class SwapTwoVariablesWithoutUsingThirdVariable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = scanner.nextInt();
		System.out.println("Enter the second number");
		int secNum = scanner.nextInt();
		scanner.close();// for best practice
		System.out.println("first number is:"+ firstNum);
		System.out.println("second number is:"+ secNum);
		
		firstNum = firstNum + secNum;// 10 + 20=30
		secNum = firstNum - secNum;//30-20=10
		firstNum = firstNum - secNum; // 30-10 =20
		System.out.println("\nAfter swap:");
		System.out.println("first number is:"+ firstNum);
		System.out.println("second number is:"+ secNum);
		
	}
}

package JavaPractice.One;

import java.util.Scanner;

public class FindTheLargestOfGivenThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number");
		int secNum = sc.nextInt();
		System.out.println("Enter the third number");
		int thirdNum = sc.nextInt();
		sc.close();
		if (firstNum > secNum && firstNum > thirdNum) {
			System.out.println(firstNum + " is the largest number");

		} else if (secNum > thirdNum) {
			System.out.println(secNum + " is the largest number");
		} else {
			System.out.println(thirdNum + " is the largest number");
		}

	}

}

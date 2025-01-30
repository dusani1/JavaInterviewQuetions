package JavaPractice.One;

import java.util.Scanner;

public class FindSquareOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Square of "+num +" is:"+(num*num));
		
		
	}
}

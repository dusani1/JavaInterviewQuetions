package JavaPractice.One;

import java.util.Scanner;

public class FindCubeOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		sc.close();
		System.out.println("Cube of the give number "+num+" is: "+(num*num*num));

	}
}

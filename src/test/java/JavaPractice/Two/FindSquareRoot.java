package JavaPractice.Two;

import java.util.Scanner;

public class FindSquareRoot {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the nubmer");
	int num = scanner.nextInt();
	double sqrRoot = Math.sqrt(num);
	System.out.println("Square root of the give number : " +sqrRoot);
}
}

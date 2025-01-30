package JavaPractice.Two;

import java.util.Scanner;

public class FindASCIIValueForChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = scanner.next().charAt(0);
		scanner.close();
		System.out.println(c +" ascii value is: "+ (int)c);
		
	}
}

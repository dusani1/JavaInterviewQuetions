package JavaPractice.Two;

import java.util.Scanner;

public class ConvertStringToLowerCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = scanner.nextLine();
		scanner.close();
		String lowerCaseStr = str.toLowerCase();
		System.out.println(lowerCaseStr);
		
		
	}
	
}

package JavaPractice.One;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindCountOfCharNumSymbAndOthers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string text");
		String str = scanner.nextLine();
		scanner.close();
		char[] ca = str.toCharArray();
		int digit = 0;
		int alpha = 0;
		int space = 0;
		int others = 0;
		//List<Character> digitChars = new ArrayList<>();
		for (Character c : ca) {
			if (Character.isDigit(c)) {
				digit++;
				//digitChars.add(c);
			} else if (Character.isAlphabetic(c)) {
				alpha++;
				
			} else if (Character.isSpaceChar(c)) {
				space++;
			} else {
				others++;
			}

		}

		System.out.println("Number of digits in the give string is: " + digit);
		//System.out.println("Digits: " + digitChars);
		System.out.println("Number of alphanumeric in the give string is: " + alpha);
		System.out.println("Number of spacess in the give string is: " + space);
		System.out.println("Number of symbols and others in the give string is: " + others);

	}

}

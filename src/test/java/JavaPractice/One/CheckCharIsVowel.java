package JavaPractice.One;

import java.util.Scanner;

public class CheckCharIsVowel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character");
		char c = scanner.next().charAt(0);
		scanner.close();
		boolean isVowel = false;
		switch (c) {
		case 'a':
		case 'e':
		case 'i':   
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;

		}

		if (isVowel)
			System.out.println("Give char " + c + " is vowel");
		else
			System.out.println("Give char " + c + " is not a vowel");

	}
}

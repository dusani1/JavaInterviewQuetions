package JavaPractice.Two;

import java.util.Scanner;

public class CapitilizeFirstLetterOfEachWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String text = scanner.nextLine();
		scanner.close();
		String[] words = text.split(" ");	
		String capitalizedSentense="";
		
		for(String word: words ) {
			char[] ca = word.toCharArray();
			char c=ca[0];
			String firstLetter = String.valueOf(c).toUpperCase();
			String captilizedWord = firstLetter;
			
			for(int i=1; i<=ca.length-1;i++) {
				captilizedWord = captilizedWord+ca[i];
			}
			
			capitalizedSentense = capitalizedSentense+captilizedWord+" ";
		}
		
		System.out.println(capitalizedSentense);
		
	}
	
}

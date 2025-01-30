package JavaPractice.One;

import java.util.Scanner;

public class ReveseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();
		char[] ca = str.toCharArray();
		int size = ca.length;
		String reversedString = "";
		for(int i=size-1; i>=0; i--) {
			reversedString = reversedString+ca[i];
			
		}
		System.out.println("Reversed string of "+str+" is "+reversedString);

	}
	
	
	
}

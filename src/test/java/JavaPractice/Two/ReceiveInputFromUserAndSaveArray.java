package JavaPractice.Two;

import java.util.Arrays;
import java.util.Scanner;

public class ReceiveInputFromUserAndSaveArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int sizeOfArray = scanner.nextInt();
		
		int[] a = new int[sizeOfArray];
		
		for(int i=0; i<sizeOfArray;i++) {
			System.out.println("Enter any number "+ (i+1) +" element");
			 a[i] = scanner.nextInt();	
			
		}
		scanner.close();
		System.out.println(Arrays.toString(a));
	}
}

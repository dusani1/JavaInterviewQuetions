package JavaPractice.One;

import java.util.Scanner;

public class SearchForTheGivenElementInArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,5,9};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number that you want to search in array");
		int searchNum = scanner.nextInt();
		scanner.close();
		boolean found = false;
		for(int i=0; i<a.length;i++) {
			if(searchNum==a[i]) {
				found=true;
				System.out.println(searchNum+ " is found in this array at the index "+i);
				break;
			}
		}
		
		if(!found)
			System.out.println(searchNum+ " not avilable in the array");
		
	}
}

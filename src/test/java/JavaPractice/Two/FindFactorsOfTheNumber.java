package JavaPractice.Two;

import java.util.Scanner;

public class FindFactorsOfTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		int count=0;
		System.out.println("Factors of the give number "+ num +" are :");
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		
		System.out.println("\nFactors count for the give number "+ num +" is :" +count);
	}
	
}

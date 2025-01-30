package JavaPractice.Two;

import java.util.Scanner;

public class CompareTwoGiveNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first numbder");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second numbder");
		int secNum = sc.nextInt(); 
		sc.close();
		if(firstNum == secNum) {
			System.out.println(firstNum + " and "+secNum + " both are equal");
		} else if(firstNum > secNum) {
			System.out.println(firstNum + " is greater than "+secNum);
			
		}else if(firstNum < secNum) {
			System.out.println(firstNum + " is less than "+secNum);
		
	}
}
}
package JavaPractice.One;

import java.util.Scanner;

public class ScanneMethodPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your full value");
		String fullName = sc.nextLine();		
		System.out.println("Enter your age in years");	
		int age = sc.nextInt();
		System.out.println("Enter you weight");
		float weight = sc.nextFloat();
		System.out.println("Enter you height");
		float height = sc.nextFloat();
		System.out.println("Enter Your City");
		String city = sc.next();
		
		sc.close();
		System.out.println("Hi "+fullName+ "\nyour age: "+age+" \nyour weight: "+weight+
				" \nyour height "+height+" \nand your from: "+city+" \n***Thanks for sharing your info with us");

		
	}
}

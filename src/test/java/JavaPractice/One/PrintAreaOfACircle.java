package JavaPractice.One;

import java.util.Scanner;

public class PrintAreaOfACircle {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the cirlce");
		double radius = sc.nextDouble();
		sc.close();
		
		System.out.println("Area of the circle having the given radius "+radius+
				" is " +(Math.PI*radius*radius));
	}
}

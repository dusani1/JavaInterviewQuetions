package JavaPractice.One;

import java.util.Scanner;

public class FindPerimeterOfCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = scanner.nextDouble();
		scanner.close();
		System.out.println("Perimeter of circle having radius: "+radius+" is: "+(2*Math.PI*radius));
		
	}
	
}

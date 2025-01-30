package JavaPractice.One;

import java.util.Scanner;

public class FindAreaOfRecangleUsingWidthAndHeight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle");
		double width = scanner.nextDouble();
		System.out.println("Enter the height of the rectangle");
		double height = scanner.nextDouble();
		scanner.close();		
		System.out.println("The Area of the rectangle : "+(height*width));
	}
}

package JavaPractice.One;

import java.util.Scanner;

public class FindPeremiterOfRectangle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter height of the rectangle");
	double height =scanner.nextDouble();
	System.out.println("Enter width of the rectangle");
	double width =scanner.nextDouble();
	scanner.close();
	System.out.println("Peremiter of the rectangle is :"+ (2*(height+width)) );
}
}

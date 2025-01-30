package JavaPractice.One;

import java.util.Scanner;

public class FibonacciSeriesTillTheInputedNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the nubmer");
		int num = scanner.nextInt();
		scanner.close();
		int a = 1;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		int f = 0;
		while (f <= num) {
			
			f = a + b;
			if(f>num)
				break;
			System.out.print(f + " ");
			a = b;
			b = f;
		}

	}

}

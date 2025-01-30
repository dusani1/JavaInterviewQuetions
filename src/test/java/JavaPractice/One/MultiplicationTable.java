package JavaPractice.One;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number");
	int num = scanner.nextInt();
	scanner.close();
	for(int i=1;i<=20;i++) {
		if(i==1) {
			System.out.println("***" +num+" Table ***");
		}
		System.out.println(num +" * "+ i +" = "+ (num*i));
		
	}
	
}
	
	
}

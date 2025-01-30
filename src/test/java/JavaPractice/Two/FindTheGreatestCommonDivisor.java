package JavaPractice.Two;

import java.util.Scanner;

public class FindTheGreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fnum = sc.nextInt();
		System.out.println("Enter the second number");
		int snum = sc.nextInt();
		sc.close();
		int gcd=0;
		for(int i=1; i<=fnum && i<=snum;i++) {
			
			if(fnum%i==0 && snum%i==0) {
				gcd = i;
			}
			
		}
		
		System.out.println(gcd);
	}
}

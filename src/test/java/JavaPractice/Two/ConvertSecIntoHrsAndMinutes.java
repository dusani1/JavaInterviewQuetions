package JavaPractice.Two;

import java.util.Scanner;

public class ConvertSecIntoHrsAndMinutes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seconds");
		int seconds = sc.nextInt();
		
		int totalMinutes = seconds/60;
		int remaingSeconds = seconds%60;
		int hours = totalMinutes/60;
		int remaingMinutes = totalMinutes%60;
		
		System.out.println(seconds + " is nothing but: "+ hours+":"+remaingMinutes+":"+remaingSeconds);
		
		
		
	}
}

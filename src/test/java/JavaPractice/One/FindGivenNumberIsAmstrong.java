package JavaPractice.One;

import java.util.Scanner;

public class FindGivenNumberIsAmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int originalNum = sc.nextInt();
		int num = originalNum;
		sc.close();
		int cubeNum=0;
		while(num > 0) {
			int reminder = num % 10;
			cubeNum = cubeNum+(reminder*reminder*reminder);
			num = num/10;
	
		}
		
		if(originalNum==cubeNum) {
			System.out.println("Given number "+originalNum+" is amostorng");
		}else {
			System.out.println("Given number "+originalNum+" is not a amostorng");
		}
		
	}
}

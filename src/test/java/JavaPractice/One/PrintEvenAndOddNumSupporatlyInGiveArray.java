package JavaPractice.One;

public class PrintEvenAndOddNumSupporatlyInGiveArray {
 public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6};
	System.out.println("Even numbers in the given array");
	for(int e: a) {
		if(e%2==0) {
			System.out.print(e+" ");
		}
	}
	System.out.println("\nOdd numbers in the given array");
	for(int e: a) {
		if(!(e%2==0)) {
			System.out.print(e+" ");
		}
	}
	
}
}

package JavaPractice.One;

public class GenerateRandomNuberWithInGiveRange {

	public static void main(String[] args) {
		
		double random = Math.random();
		int range = 150;
		System.out.println("Random number in the range of "+range+" is: "+(int)(random*range));
		
	}
	
}

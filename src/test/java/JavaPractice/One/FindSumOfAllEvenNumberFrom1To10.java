package JavaPractice.One;

public class FindSumOfAllEvenNumberFrom1To10 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		System.out.println("sum of 1 to 10 even numbers is: "+ sum);
	}
}

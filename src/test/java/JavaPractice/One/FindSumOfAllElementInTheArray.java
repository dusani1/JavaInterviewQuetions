package JavaPractice.One;

public class FindSumOfAllElementInTheArray {
	public static void main(String[] args) {
		int[] a = {2,3,4,5,1,2};
		int sum = 0;
		for(int e: a){
			sum = sum +e;
		}		
		
		System.out.println("sum of the array :"+sum);
	}
}

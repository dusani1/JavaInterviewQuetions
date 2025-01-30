package JavaPractice.One;

public class FindMinAndMaximumNumInArray {

	public static void main(String[] args) {
		int[] a = {1,2,4,6,7,9,4,0,0};		
		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<a.length;i++) {
			
			if(max < a[i] ) {
				max = a[i];
			}
			if(min > a[i] ) {
				min = a[i];
			}
		}
		
		System.out.println("Max value in the give array is: "+ max);
		System.out.println("min value in the give array is: "+ min);
	}
	
}

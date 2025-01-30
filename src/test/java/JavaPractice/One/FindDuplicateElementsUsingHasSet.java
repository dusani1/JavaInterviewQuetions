package JavaPractice.One;

import java.util.HashSet;

public class FindDuplicateElementsUsingHasSet {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,4,5,6,7,6};
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		
		for(int i=0; i<a.length; i++) {
		
			if(hset.add(a[i])==false) {
				System.out.println(a[i]+" is a duplicate element in the array");
			}
			
			
		}
		
	}
}

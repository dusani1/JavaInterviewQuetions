package JavaPractice.One;

public class ConvertIntToString {
	public static void main(String[] args) {
		int a = 34352;
		String str = Integer.toString(a);
		System.out.println(str.length());
		sumallchar();
	}
	
	public static void sumallchar() {
		int a = 34352;
		String str = Integer.toString(a);
		int sum=0;
		for(int i=0; i<str.length();i++) {
			int num = Character.getNumericValue(str.charAt(i));
			//int num = str.charAt(i)-'0';
			sum= sum+num;
		}
		System.out.println(sum);
	}
	
	
	
	
}

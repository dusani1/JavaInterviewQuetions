package JavaPractice.One;

public class ConvertStringToInt {
	public static void main(String[] args) {
		String str = "10";
		//using parseInt or valueOf we can convert to int
		int num = Integer.parseInt(str);
		int num1 = Integer.valueOf(str);
		System.out.println(num);
		System.out.println(num1);
	}
	
}

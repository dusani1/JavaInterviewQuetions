package JavaPractice.Two;

public class RemoveWhiteSpacesInGiveString {

	public static void main(String[] args) {
		String str = "A B B  C  D";
		//String str2 = str.replaceAll("\\s", ""); //using reg expression
		String str2 = str.replaceAll(" ", ""); //using space
		System.out.println(str2);
		
	}
}

package JavaPractice.Two;

public class OccuranceOfCharInGivenStirng {

	public static void main(String[] args) {
		String str = "Sample Text For Test Occurance";
		String findChar = "e";
		appoarchOne(str,findChar);
		appoarchOne(str,"c");
		appoarchTwo(str);
	}

	public static void appoarchOne(String str,  String findChar) {	
		int strLenght = str.length();
		String str2 = str.replace(findChar, "");
		int str2Lenght = str2.length();
		System.out.println(findChar +" occures " + (strLenght - str2Lenght) + " Times in the given text");
	}

	public static void appoarchTwo(String str) {
		char[] ca = str.toCharArray();
		int count=0;
		for(char e: ca) {
			if('e'==e) {
				count++;
			}
		}
		
		System.out.println(" e occures " + count + " Times in the given text");
	}

}

package JavaPractice.Two;

public class ReverseEachAndEveryWordInGiveString {

	public static void main(String[] args) {
		String str = "Venkata Subba Reddy Dusani";

		String[] words = str.split(" ");

		String revesedString = "";
		for (String word : words) {
			String revesedWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revesedWord = revesedWord + word.charAt(i);

			}

			revesedString = revesedString + revesedWord + " ";

		}
		System.out.println("Revesed word for the " + str + "is: " + revesedString);

	}

}

package JavaPractice.Two;

public class RemoveSpacesSpecialCharAndOtherJunkFromString {

	public static void main(String[] args) {
		String str = "*(&^#(&2  dskjflj laskjflkeio*)(u32";
		String str2 = str.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println("Removed special char, spaces and other junk in"+str+ " now your text is :"+str2);
	}
}

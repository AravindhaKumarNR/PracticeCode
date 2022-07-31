package ClassCode;

public class PracticeStringReverse {
	public static void main(String[] args) {
		//Reversing a string.
		String text="TestLeaf";
		char[] charArray = text.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		//charAt();
		System.out.println("__________________");
		System.out.println();
		for(int i=text.length()-1;i>=0;i--) {
			char t=text.charAt(i);
			System.out.print(t);
		}
	}
}

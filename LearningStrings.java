package ClassCode;

public class LearningStrings {

	public static void main(String[] args) {
		String text="Good Morning";
		
		int length=text.length();
		
		System.out.println(length);
		char[] charArray = text.toCharArray();
		System.out.println(charArray);
		//Printing the arary
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		System.out.println("_________");
		for(int i=0;i<text.length();i++) {
			char charAt=text.charAt(i);
			System.out.println(charAt);
		}
	}

}

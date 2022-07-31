package ClassCode;

public class CountingCharacter {
	public static void main(String[] args) {
		//Counting character of a letter
		String str="Welcome to chennai";
		str=str.toLowerCase();
		char[] charArray = str.toCharArray();

		//To get the length of the array
		System.out.println("Character length:"+charArray.length);
		int count=0;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='e') {
				count=count+1;
			}
		}
		System.out.println("Total count of e in the given string is:"+count);
	}
}

package ClassCode;

public class CheckingPalindrome {

	public static void main(String[] args) {
		//Use only .equals for Strings
		String value="madam";
		String reverse="";
		char[] charArray = value.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			reverse=reverse+charArray[i];
		}
		//.equals
		boolean equals=value.equals(reverse);
		if(equals==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		System.out.println("is the given text a palindrome:"+equals);

		//comparing with equalsIgnoreCase.
		String value1="MaDam";
		String reverse1="";
		char[] charArray1 = value1.toCharArray();
		for(int i=charArray1.length-1;i>=0;i--) {
			reverse1=reverse1+charArray1[i];
		}
		boolean equals1=value1.equalsIgnoreCase(reverse1);
		System.out.println("is the given text a palindrome:"+equals1);

	}

}

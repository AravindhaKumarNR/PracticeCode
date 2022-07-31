package ClassCode;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wheras .equals compare the content of the string.
		String text1="TestLeaf";
		String text2="TestLeaf";
		
		boolean equals =text1.equals(text2);
		System.out.println(equals);
		
		String name1=new String("Kannan");
		String name2=new String("kannan");
		boolean equal=name1.equals(name2);
		//ignoring case sensitiviness
		boolean equalIgnoreCase=name1.equalsIgnoreCase(name2);
		System.out.println("equalIgnoreCase:"+equalIgnoreCase);
		System.out.println(equal);
		
		//can also be compared with double equal to sign checks the memory address
		System.out.println("Comparing with equals sign:");
		if(text1==text2) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		System.out.println("-------------------");
		//Spliting the text:
		String text="I like Chicken Biriyani";
		text.split(text);
		String[] splittedText=text.split(" ");
		for(int i=0;i<splittedText.length;i++) {
			System.out.println(splittedText[i]);
		}
		//to convert string to uppercase
		System.out.println(text1.toUpperCase());
		//to convert string to lowercase
		System.out.println(text1.toLowerCase());
	}

}

package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a string value as madam
		String text ="madam";
		// declare the another string rev as ""
		String rev ="";
		// convert string text into char
		char[] charArray=text.toCharArray();
		//iterate the string value in reverse order
		for(int i=charArray.length-1;i>=0;i--) {
			rev=rev+charArray[i];			
			}
		// compare the string text and rev string text
		if (text.equals(rev)) {
			// if it's same print as The Given String is palindrome
			System.out.println("The Given String is palindrome");
			
		}
		//if it's dose not same print as The Given String is not palindrome
		else {
			System.out.println("The given string is not palindrome");
		}
		
		

	}

}

package week3.day1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// declare the sting value via console
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your text");
		// scan the given string  text 
		String text =scan.nextLine();
		// convert string text into char 
		char[] rev=text.toCharArray();
		//iterate the rev string value
		for(int i=rev.length-1;i>=0;i--) {
			//print the  reverse stringh
			System.out.print(rev[i]);
		}

	}

}

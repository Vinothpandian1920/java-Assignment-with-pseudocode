package week2.day2;

import java.util.Iterator;

public class PrintDuplicate {

	public static void main(String[] args) {
		// declare the value
		int [] num = {11,22,33,44,55,66,22,77,11};
		// get the array length 
		System.out.println("Array length :" +num.length);
		// iterate the value
		for(int i=0;i<num.length;i++) {
		for (int j=i+1;j<num.length;j++) {
			// compare both iterate value
			if (num[i]==num[j]) {
				// print the matching value
				System.out.println("The duplicate value is :" +num[i]);
				
			}
		}	
		}
		
		

	}

}

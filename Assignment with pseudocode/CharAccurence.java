package week3.day1;

public class CharAccurence {
 
	public static void main(String[] args) {
// declare the string
    String input = "Testleaf";
  
    //to get the size of input 
    System.out.println(input.length());
    //convert string into charArray
    char[]charArray=input.toCharArray();
    //intialize the count variable as 
    int count=0;
    //iterate the char
    for (int i=0;i<charArray.length;i++) {
    	 //check the condition if it is  match,
    	if(charArray[i]=='e') {
    		// increase the count variable
    		count++;
    	
    	 //print the count 
    	}
    	
    	
    	}
	 //print the count 
    System.out.println(count);
    }
    

   
	

}

package week3.day1;
import java.util.Arrays;
public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare the value
		int[]num = {2,5,6,8,9,1,3,4};
		// sort the array num value
		Arrays.sort(num);
		// find the array length
		int n=num.length+1;
		// find the sum value
		int sum=n*(n+1)/2;
		//iterate the value
		for (int i=0;i<num.length;i++) {
			// subtract the value in sum and num[i]
			sum=sum-num[i];
		}
		// print the sum value( missing element)
		System.out.println("The missing element is :"+sum);

	}

}

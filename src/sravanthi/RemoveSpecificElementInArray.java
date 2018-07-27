package sravanthi;

import java.util.Arrays;

public class RemoveSpecificElementInArray {

	public static void main(String[] args) {
		int[]arr= {25,40,56,32,89,76,45,27,61};
		   System.out.println("Original Array : "+ Arrays.toString(arr)); 
		   for(int i=1;i<arr.length-1;i++) {
			arr[i]=arr[i]+1;
		   }
		   System.out.println("After removing the second element:"+ Arrays.toString(arr));
	}

}

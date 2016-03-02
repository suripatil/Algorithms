package practice;

import java.lang.*;
import java.util.*;

/* Selection Sort in Java */

public class SelectionSort {
	public static void main(String [] args) {
	int size = 10,temp = 0,j = 0, i = 0 ;
		
	int[] arr = new int[size];
	Scanner in = new Scanner(System.in);
	
	//Read Numbers
	for(i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	 }
	
	// Find Minimum , Swap with left element , Iterate till outer loop reaches end
	for (i = 0; i < size -1; i++) { //Outer loop
		for (j = i+1; j < size;j++) { //Inner loop 
			if (arr[j] < arr[i]) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}				
		}	
	}
	
	// Display Sorted Array
	for(i = 0; i < size; i++) {
		System.out.print(" "+ arr[i]);
	}
	
	}
}

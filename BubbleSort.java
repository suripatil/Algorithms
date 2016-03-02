
package practice;

import java.lang.*;
import java.util.*;

/* Bubble sort in Java */

public class BubbleSort {
	public static void main(String [] args) {
	int size = 10,temp = 0,inner = 0, outer = 0;
		
	int[] arr = new int[size];
	Scanner in = new Scanner(System.in);
	
	//Read Numbers
	for(int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	 }
	
	// Compare two items , swap if A > B , iterate till end
	for (outer = size-1 ; outer > 1; outer--) { // Outer loop for N-1 Phases
		for (inner = 0; inner < outer ; inner++) { // Inner Loop
			if (arr[inner] > arr[inner+1]) { //Swap if A > B
				temp = arr[inner];
				arr[inner] = arr[inner+1];
				arr[inner+1] = temp;
			}
		}
	}
	// Display Sorted Array
	for(int i = 0; i < size; i++) {
		System.out.print(" "+ arr[i]);
	 }
	
	}
}


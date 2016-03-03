package practice;

import java.lang.*;
import java.util.*;

/* Insertion Sort in Java */

public class InsertionSort {
	public static void main(String [] args) {
	int size = 10,temp = 0,j = 0, i = 0 ;
		
	int[] arr = new int[size];
	Scanner in = new Scanner(System.in);
	
	//Read Numbers
	for(i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	 }
	
	// Make sorted and unsorted list,keep adding items to sorted by shifting larger elements to right
	//Iterate till outer loop reaches end
	for (i = 0; i < size -1; i++) { //Outer loop moves toward's right
		temp = arr[i];	//Unsorted value
		j = i; //Inner loop move toward left
		while (j > 0 && arr[j-1] > temp) { //Shift larger values 
			arr[j] = arr[j-1];
			j--;	//Move left
			}
		arr[j] = temp; //Copy smaller element
	}	
	
	// Display Sorted Array
	for(i = 0; i < size; i++) {
		System.out.print(" "+ arr[i]);
	}
	}
}

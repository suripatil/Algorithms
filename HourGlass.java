import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass {

    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
		int a[][]  = new int[6][6];
		Scanner in = new Scanner(System.in);
		int temp_sum,sum = -1000000; //Large -Ve Sum to compare with negative number
		
		//Read 2D Matrix-Array 
		for(int i = 0; i < 6; i++) {
			for (int j =0; j < 6;j++) {
				a[i][j] = in.nextInt();
			}
		}
		
        //Logic to calculate sum
		for(int i = 0; i < 6; i++) {
			for (int j =0; j < 6;j++) {
				if(j+2 < 6 && i+2 < 6) {
					temp_sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
					
					if (temp_sum > sum) {
						sum = temp_sum;
					}						
				}				
			}
		}
		System.out.println(sum);
        
    }
}



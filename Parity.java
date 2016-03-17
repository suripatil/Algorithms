import java.util.*;
import java.lang.*;
import java.io.*;

/* Count parity of a number (if number of 1's in number is odd return 1 , else return 0 - EVEN/ODD Parity) */

class Parity
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int x;
	    int count = 0;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Integer Number");
	    x = sc.nextInt();
	    
	    while (x != 0) {
	        count ^= 1;
	        x &= (x-1);/* Eliminates right most 1 bit wich is set */
	    }
	    
	    if (count == 1)
	        System.out.println("Number has Odd Parity");
	    else
	        System.out.println("Number has Even Parity");
	    
	}
}

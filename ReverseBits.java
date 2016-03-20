import java.lang.*;
import java.util.*;

/* Reverse all the bits in integer number */

/********************************************************
 * These are the bit masks used in the bit reversal process

   0x55555555 = 01010101010101010101010101010101
   0xAAAAAAAA = 10101010101010101010101010101010
   0x33333333 = 00110011001100110011001100110011
   0xCCCCCCCC = 11001100110011001100110011001100
   0x0F0F0F0F = 00001111000011110000111100001111
   0xF0F0F0F0 = 11110000111100001111000011110000
   0x00FF00FF = 00000000111111110000000011111111
   0xFF00FF00 = 11111111000000001111111100000000
   0x0000FFFF = 00000000000000001111111111111111
   0xFFFF0000 = 11111111111111110000000000000000
Ref - 
http://stackoverflow.com/questions/21619397/reverse-all-bits-in-an-int-and-return-the-int
http://graphics.stanford.edu/~seander/bithacks.html#BitReverseObvious

 */

public class ReverseBits {

	/* Brute Force Approach - loop for 32 i from start and j from end , if both differ use 1 with XOR to swap */ 
	/* Lookup Optimal Solution */
	public static int reverse_bits(int x) {
		x = (x & 0x55555555) << 1 | (x & 0xAAAAAAAA) >>> 1;
		x = (x & 0x33333333) << 2 | (x & 0xCCCCCCCC) >>> 2;
		x = (x & 0x0F0F0F0F) << 4 | (x & 0xF0F0F0F0) >>> 4;
		x = (x & 0x00FF00FF) << 8 | (x & 0xFF00FF00) >>> 8;
		x = (x & 0x0000FFFF) << 16 | (x & 0xFFFF0000) >>> 16;
		return x;
	}

	public static void main (String[] args) {

		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:-");
		x = sc.nextInt();
		
		System.out.println("Number Before reverse:- "+Integer.toBinaryString(x));
		x = reverse_bits(x);
		System.out.println("Number Aftere reverse:- "+Integer.toBinaryString(x));

	}
}
  

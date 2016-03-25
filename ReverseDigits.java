import java.lang.*;
import java.util.*;
/* Reverse an Integer Digits (231 -> 132 , -321 -> -123) O(n) solution */

public class ReverseDigits {
	/* Function to Reverse Integer Number */
	static long reverse(long x) {
		boolean sign = x < 0;
		long result = 0;
		x = Math.abs(x);

		while (x != 0) {
			result = result * 10 + (x % 10);
			x /= 10;
		}
		return sign ? -result:result;	
	}
	public static void main(String[] args) {
		long x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		x = sc.nextInt();
		System.out.println(reverse(x));
	}
}

 

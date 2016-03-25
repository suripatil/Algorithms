import java.lang.*;
import java.util.*;

/* Check wether given Number is Palindrome or Not */

public class Palindrome {
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
		long num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		num = sc.nextInt();
		System.out.println(num == reverse(num));
	}
}

 

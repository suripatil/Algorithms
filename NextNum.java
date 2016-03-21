import java.lang.*;
import java.util.*;

/* Find next nearest integer with same wieght
	weight is number of 1's in number.
	Ex - if x is 6 with weight 2 , next nearest integer is 5
*/
public class NextNum {

	public static int compute_weight (long x) {
		int wieght = 0;
		while ( x != 0) {
			wieght++;
			x &= (x-1);
		}
		return wieght;
	}
	/* Brute Force Approach */	
	public static long next_nearest(long x) {
		int wt = compute_weight(x);
		for(int i = 1; i < 100; i++) {
			if(wt == compute_weight(x-i)){
				return x-i;
			}
			if(wt == compute_weight(x+i)) {
				return x+i;
			}
		}
		return -1;
	}

	/* Effiecent algo with O(n) - Swap right most bits in given number when they differ */
	public static long next_nearest_eff(long x) {
		for (int i = 0; i < 62; i++) { /* Considering 63 bits for long */
			if((((x >>> i) & 1) != ((x >>> (i+1)) & 1))) {
				x ^= (1 << i) | (1 << (i+1)); /* Swap K1 and K2 if differ */
				return x;
			}
		}
		throw new IllegalArgumentException("All bits are 0 or 1");
	}
			
	public static void main (String [] args) {
		long num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:-");
		num = sc.nextInt();
		
		System.out.println("Nearest number for - "+num+" with equal wieght is - "+next_nearest_eff(num));
	}
}


	

	


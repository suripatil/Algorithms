import java.lang.*;
import java.util.*;

/* Java Program to swap bit's from i and j locations */
class bit_count {

	public long swap_bits(long x,int i,int j) {
		if(((x >>> i) & 1) != ((x >>> j) & 1)) {
			long mask = (1L << i) | (1L << j);
			x ^= mask;
		}
	 return x;
	}
}

public class SwapBits {

	public static void main(String[] args) {
		long x;
		int i ,j;
		Scanner sc = new Scanner(System.in);
		bit_count bt = new bit_count();
	
		System.out.println("Enter Number with i and j positions to swap:- ");
		x = sc.nextInt();
		i = sc.nextInt();
		j = sc.nextInt();
	
		x = bt.swap_bits(x,i,j);
		System.out.println("Resulting Number after Swap:- " +x);

	}
}

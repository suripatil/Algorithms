import java.util.*;
import java.lang.*;

/* Java Program to toggle bit's in a number (0 <-> 1) */
public class ToggleBits {
	
	public static void print_bits(long x) {
		long mk;
		int res;
		for(int i = 0; i < 64; i++) {
			mk = 1L << i;
			res = ((x & mk) == 1) ?1:0;
			System.out.print(res);
		}	
		System.out.println("");	
	}
	
	public static void main (String[] args) {
		long num,mask;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
		print_bits(num);	
			
		mask = ~(0);	
		num ^= mask;
		print_bits(num);	
		System.out.println("Toggled Result is:- "+num);

	}
}
			
	

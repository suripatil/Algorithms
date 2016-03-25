import java.lang.*;
import java.util.*;

/* Java Program to compute x to the power of y with Bitwise operations */

public class Power {
	static double power_xy(double x,int y) {
		double result = 1.0;
		int power = y;
		/* Negetive Power */
		if (y < 0) {
			power= -power;
			x = 1.0/x;
		}	
		while(power != 0) {
			if((power & 1) != 0)
				result *= x;
			x *= x;
			power >>>= 1; 
		}
		return result;
	}
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter x and y :- ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println(power_xy(x,y));
	}
}

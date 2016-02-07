/* Hacker Rank - https://www.hackerrank.com/challenges/staircase
 * 
 * @author suri
 *
 */
import java.io.*;
import java.util.*;

public class StairCase {
	public static void main(String [] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		/* Read N from User */
		n = input.nextInt();
		
		/* Loop for N times */
		for (int i = 1; i <= n;i++)
		{	/* Print space (n-i) times */
			for (int j = 0; j < (n-i);j++) 
			{
				System.out.print(" ");
			}
			/* Print # for i times */
			for (int k = 1; k <= i;k++) 
			{
				System.out.print("#");
			}
			/* Print newline */
			System.out.println("");
		}		
	}
}

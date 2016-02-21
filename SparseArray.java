import java.lang.*;
import java.util.*;
import java.io.*;

/**
 * Hacker Rank - Sparse Arrays
 * https://www.hackerrank.com/challenges/sparse-arrays
 * @author Surendra
 *
 */
public class SparseArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> n_strings = new ArrayList<String>();
		List<String> q_strings = new ArrayList<String>();
		
		//Read N Strings and store them in List array
		int n = 0;
		n = in.nextInt();		
		for(int i = 0; i < n;i++) {
			n_strings.add(in.next()); /* Original strings */
		}
		
		//Read N Strings and store them in List array
		int q = 0;
		q = in.nextInt();		
		for(int i = 0; i < q;i++) {
			q_strings.add(in.next()); /* Query Strings */
		}
		
		/* Search Query string in Original string array , 
		 * keep count for number of matches
		 * Print the counter after reaching end of Original String Array
		 * Repeat this until end of q array is reached
		 */
		int count =0;
		for(int i =0; i < q;i++) {
			count = 0;
			for(int j = 0; j < n; j++){
				if (q_strings.get(i).equals(n_strings.get(j))) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}


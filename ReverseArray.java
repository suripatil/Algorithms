package practice;
/* Hacker Rank - Read Integer Array and reverse it -https://www.hackerrank.com/challenges/arrays-ds */

import java.util.*;
import java.io.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> elements = new ArrayList<Integer>();
		
		/* Read the SIZE n elements into Array */
		int size = in.nextInt();
		for (int i = 0; i < size;i++) {
			elements.add(in.nextInt());
		}
		Collections.reverse(elements);
		for(int i:elements) {
			System.out.print(i + " ");
		}
	}
}


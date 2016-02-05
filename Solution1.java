/* Plus minus - HackerRank 
	https://www.hackerrank.com/challenges/plus-minus
*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution1 {
	public static void main(String[] args) {

		double size = 0; 
		int num,pcount,ncount,zcount;
		num = pcount = ncount = zcount = 0;

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(6);

		size = input.nextInt();

		for (int i = 0; i < size; i++) {
			num = input.nextInt();
			if (num > 0) 
				pcount++;
			if (num < 0)
				ncount++;
			if (num == 0)
				zcount++;
		}
		System.out.printf("%.6f\n",pcount/size);
		System.out.printf("%.6f\n",ncount/size);
		System.out.printf("%.6f\n",zcount/size);		
	}
}
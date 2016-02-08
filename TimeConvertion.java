import java.io.*;
import java.util.*;
import java.lang.Object;
/* Java Program to Convert 12HR time to 24HR 
   Problem - Hacker Rank - https://www.hackerrank.com/challenges/time-conversion
*/

public class TimeConvertion {

	/**
	 * @param args
	 */
public static void main(String[] args) {
	/* Read The time */
	Scanner in = new Scanner(System.in);
	String input_time = in.next();

	//Parse the input
	String [] tm = input_time.split(":");

	//Extract hh and SS to char array to process AM/PM
	int hh = Integer.valueOf(tm[0]);		
	char[] secs_str = tm[2].toCharArray();

	//AM/PM Time Convertion
	if((secs_str[2] == 'A') && (hh == 12)) 
	{
		hh=00;
	} 
	else if((secs_str[2] == 'P') && (hh == 12))
	{
		hh=12;
	}
	else if((secs_str[2] == 'P') && (hh < 12))
	{
		hh += 12;
	}
	//Format the 24 HR Time and Print
	String new_hh = String.format("%02d",hh);
	System.out.println(new_hh+":"+tm[1]+":"+secs_str[0]+secs_str[1]);
	}
}


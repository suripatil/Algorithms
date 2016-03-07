package DataStructure;

import java.lang.*;
import java.util.*;

/* Bracket App Main Program */
/* Ex Input -a{b(c[d]e)f} , No output if  all the bracket matche with each other,else Error message is diplayed*/

public class BracketApp {
public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	String input;
	input = in.nextLine();
	
	BracketChecker bc = new BracketChecker(input);
	bc.check();	
	
	}
}

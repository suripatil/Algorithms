package practice;

import java.lang.*;

/* Stack Application Program */

public class StackApp {
	public static void main(String[] args) {
		Stack st = new Stack(10);
		
		System.out.println("Pushing items - 10 20 30 ");
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println("Popping items");
		while( !st.IsEmpty()) {
			System.out.println(st.pop());
		}
		
	}
}


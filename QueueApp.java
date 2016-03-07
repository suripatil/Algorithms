package DataStructure;

import java.lang.*;

/* Queue Application */

public class QueueApp {
	
	public static void main(String[] args) {
		Queue dq = new Queue(5);
		
		dq.insert(10);dq.insert(20);dq.insert(30);dq.insert(40);
		dq.remove();dq.remove();dq.remove();
		
		dq.insert(50);
		dq.insert(60); // WrapAround
		dq.insert(70);
		
		while (!dq.IsEmpty()) {
			long n = dq.remove();
			System.out.println(n);
		}
	}
}


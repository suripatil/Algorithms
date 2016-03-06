
package practice;

/* Stack Class Implementation in Java */

public class Stack {
	
		private int MaxSize;
		private long[] StackArray;
		private int top;
		
		//Constructor
		public Stack(int size) {
			MaxSize = size;
			StackArray = new long[size];
			top = -1;
		}
		
		//Push
		public void push(long item){
			StackArray[++top] = item;
		}
		
		//Pop
		public long pop(){
			return StackArray[top--];
		}
		
		//IsEmpty
		public boolean IsEmpty()
		{
			return (top == -1);
		}
		
		//IsFull
		public boolean IsFull()
		{
			return (top == MaxSize-1);
		}
		
}


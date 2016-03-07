
package DataStructure;

import java.lang.*;

/* Queue Implementation Class */

public class Queue {
	
	private int MaxSize;
	private long [] QArray;
	private int Rear,Front;
	private int NItem;
	
	public Queue(int Size) {
		MaxSize = Size;
		QArray = new long[MaxSize];
		Rear = -1;
		Front = NItem = 0;			
	}
	
	public void insert(int elem) {
		
		if(Rear == MaxSize -1) //Wrap Around
			Rear = -1;
		QArray[++Rear] = elem;
		NItem++;
	}
	
	public long remove() {
		if(Front == MaxSize)
			Front = 0;
		NItem--;
		return QArray[Front++];
	}
	
	public boolean IsEmpty() {
		return (NItem == 0);
	}
	
	public boolean IsFull() {
		return (NItem == MaxSize);
	}
	
	public int size() {
		return NItem;
	}
}

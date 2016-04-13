import java.lang.*;
import java.util.*;

/* Linked List Class */
class Link {
	public int data;
	public Link next;
	
	//Constructor
	public Link(int x) {
		data = x;
	}
}

/* Application Support Class */
class List_Link {
	private Link first;

	public List_Link() {
		first = null;
	}	
	public boolean IsEmpty() {
		return (first == null);
	}
	
	public void InsertFirst(int x) {
		Link temp = new Link(x);
		temp.next = first;
		first = temp;
	}
	public Link RemoveFirst() {
		Link temp = first;
		if(IsEmpty() != true) {
			temp = first;
			first = first.next;
		}
	return temp;
	}
	public void DisplayList() {
		if(IsEmpty() != true) {
		 Link temp = first;		 
		 while (temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("");
	 }
	}
}

/* Main Program Class */
public class List_App {
	public static void main (String[] args) {
	List_Link l1 = new List_Link();
	
	l1.InsertFirst(10);
	l1.InsertFirst(20);
	l1.InsertFirst(30);

	l1.DisplayList();	

	l1.RemoveFirst();
	l1.RemoveFirst();
	
	l1.DisplayList();

	}
}

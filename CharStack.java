package DataStructure;

/* Stack Class Implementation in Java */

public class CharStack {

                private int MaxSize;
                private char[] StackArray;
                private int top;

                //Constructor
                public Stack(int size) {
                        MaxSize = size;
                        StackArray = new char[size];
                        top = -1;
                }

                //Push
                public void push(char item){
                        StackArray[++top] = item;
                }

                //Pop
                public char pop(){
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

class BracketChecker {
	private String input;
	
	public BracketChecker(String in) {
		input = in;
	}
	
	public void check()
	{
		int stacksize = input.length(); //Max Stack Size
		Stack st = new Stack(stacksize);
		
		for(int j =0; j<input.length();j++){
			char ch = input.charAt(j);
			
			switch(ch) {
			
			case '{':
			case '[':
			case '(':
				st.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if( !st.IsEmpty()) {
					char chx = st.pop();					
					if ((ch == '}' && chx != '{') || 
						(ch == ']' && chx != '[') || 
						 (ch == ')' && chx != '(')) 
						System.out.println("Eroor"+ch+ " at "+j);
					  
				} else 
					System.out.println("Eroor"+ch+ " at "+j);
				break;
			default:
				break;
			} //Switch
		} //For
		if(!st.IsEmpty()) {
			System.out.println("Eroor: Missing Right Delimeter");
		}
		
	}	
}


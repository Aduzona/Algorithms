package adt;

public  class ArrayStack<E> implements Stack<E> {

	private E[] items;                    // generic array used for storage    
	private int top;                        // index of the top item    
	public ArrayStack(int maxSize) {        // constructs list with given capacity 
		items = (E[]) new Object[maxSize];   // safe cast; compiler may give warning       
		top = -1;    
		}    
	public boolean isEmpty () {  
		return(top == -1);   
		}   
	public boolean isFull() {       
		return (top == items.length-1);    
		} 
	public boolean push(E item) {       
		if (isFull( ))        
			return false;       
		top++;                            //increment top before storing new item      
		items[top] = item;                //store new item     
		return true;    
	}
	
	public E pop() {       
		if (isEmpty( ))          
			return null;      
		E answer = items[top];                   
		items[top] = null;                // dereference to help garbage collection       
		top--;                            // decrement top       
		return answer;    
	}
	@Override
	public E top() {
		// TODO Auto-generated method stub
		return items[top];    
	} 
	
	public String toString() {
		String allContent = new String();
		while(top>=0) {
			allContent = allContent +top()+ ",";
		    top--;
		}
	//	allContent = allContent +top();
		return allContent;
		
		
	}
	
	//Reverse a Data sequence
	
	public static <E> void reverse(E[ ] data) {    
		ArrayStack<E> buffer = new ArrayStack<>(data.length); //Create a buffer array length for E[]
		for (int i=0; i < data.length; i++)       
			buffer.push(data[i]);   
		for (int i=0; i < data.length; i++)       
			data[i] = buffer.pop( ); 
		} 
}

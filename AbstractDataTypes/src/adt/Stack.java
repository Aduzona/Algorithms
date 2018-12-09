package adt;

public interface Stack<E> {
	boolean push(E item);  //inserts an item at the top of the stack    
	E pop();    //removes and returns the top element from the stack    
	E top();    //returns the top element of the stack, without removing it    
	boolean isEmpty();     //tests whether the stack is empty   
	boolean isFull();      //tests whether the stack is full 
}

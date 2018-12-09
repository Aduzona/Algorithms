package adt;

public interface Queue<E> {

	 boolean enqueue(E item); //inserts an item at the rear of the queue   
	 E dequeue();  //removes and returns the item at the front of the queue    
	 E first();    //returns the item at the front of the queue,  //without removing it    
	 boolean isEmpty();     //tests whether the queue is empty  
	 boolean isFull();      //tests whether the queue is full 
}

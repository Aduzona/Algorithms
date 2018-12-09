package adt;

public class ArrayQueue<E> implements Queue<E>{

	private E[] items;       //generic array used for storage    
	private int front;         //the index of the item at the front of the queue    
	private int rear;          //the index of the item at the rear of the queue    
	private int numItems;      //the number of items in the queue     
	public void ArrayQueue(int maxSize) { 
		items = (E[])new Object[maxSize];       
		front = 0;       
		rear = -1;       
		numItems = 0;    
		}    
	public boolean isEmpty() {              
		return (numItems == 0);   
		}    
	public boolean isFull() {        
		return (numItems == items.length);    
		}
	public boolean enqueue (E item) {        
		if (isFull())           
			return false;       
		rear = (rear + 1) % items.length; //increment rear before adding the item  
		items[rear] = item;               //store new item      
		numItems++;       
		return true;                 
	}
	public E dequeue ( ) {        
		if (isEmpty())         
			return null;      
		E removed = items[front];        
		items[front] = null;                // dereference to help garbage collection               
		front = (front + 1) % items.length; //increment front       
		numItems--;      
		return removed;              
	}
	@Override
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}  

}

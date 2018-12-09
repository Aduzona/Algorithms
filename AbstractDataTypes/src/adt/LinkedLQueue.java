package adt;

public class LinkedLQueue<E> implements Queue<E>{

	
	private class Node<E> {       
		private E item;                  // reference to the item stored at this node        
		private Node<E> nextNode;        // reference to the subsequent node in the list        
		private Node(E element, Node<E> next) { 
			item = element;     // creates a node with the given item          
			nextNode = next;    // and next mode.        
			     
		}
	}
	
	 private Node<E> front;               // the node containing the item at the front    
	 private Node<E> rear;                // the node containing the item at the rear 
	 
	public void LinkedLQueue() {
		// TODO Auto-generated constructor stub
		 front = null;                 
		 rear = null; 
	}

	public boolean enqueue(E item) {       
		Node newNode = new Node(item, null);       
		if (isEmpty( ))          
			front = rear = newNode;       
		else {          
			rear.nextNode = newNode;          
			rear = newNode;       
			}       
		return true; 
		}

	public E dequeue() {       
		if (isEmpty( ))          
			return null;
		E removed = front.item;       
		if (front == rear) {          
			front = null;          
		    rear = null;   
		}else       
			front = front.nextNode;      
			return removed;
		
			
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == null);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}

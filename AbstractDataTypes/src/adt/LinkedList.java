package adt;

public class LinkedList<E> {

	private class Node<E>{ //Inner Node Class defined within the LinkedList
		private E item; //reference to the stored at this node
		//private E item; can only contain item and cannot contain any reference.
		private Node<E> nextNode; //reference to the subsequent node in the list
		//private Node<E> nextNode contains both the item and reference of the next npde.
		
		private Node(E element, Node<E> next) { 
			// TODO Auto-generated constructor stub
			item =element; //creates a node with the given item
			nextNode = next; // and next node.
		}

		public E getElement() { //Accessor methods
			return item;
		}
		public Node<E> getNextNode(){
			return nextNode;
		}
		
		public void setElement(E element) {
			this.item=element;
		}
		
		public void setNextNode(Node<E> Node) {
	     this.nextNode =Node;		
		
		}
		
	}
	
	
	private Node<E> head=null; //head node of the list
	private Node<E> tail=null; //last node of the list
	private int size=0;       //number of nodes in the list
	public LinkedList() {}    //constructs an initially empty list
	
	public boolean isEmpty() {
		return size==0;
	}
	public int getSize() {
		return size;
	}
	
	public E firstElement() {  //return the element of the first node
		if(isEmpty())
			return null;
		return this.head.getElement();
		
	}
	public E lastElement() { //return the element of the last node
		if(isEmpty())
			return null;
		return this.tail.getElement(); 
	}
	public void addFirstElement(E newElem) { //adds element to front
		head = new Node<>(newElem, head); //create and link a node
		if(isEmpty()) 
			tail = head;                  //special case: new node becomes tail also
		size++;                           // increment number of nodes in the list
		
	}
	
	public E removeFirstElement() { // remove and returns the element
		if(isEmpty())
			return null;        //nothing to remove
		E answer = head.item;  // saves the data in head.item to avoid being lost
		head = head.nextNode; //will become null if list had only one node
		size--;               //decrement number of nodes in the list
		
		if(isEmpty())
			tail=null;    //special case as list is now empty
		return answer;  //does answer contains the removed element? yes it does.
		
	}
	
	public void addLastElement(E newElem) { //adds element to the end
		Node<E> newest = new Node<>(newElem, null); 
		
		if(isEmpty())
			head = newest;   //special case: previously empty list
		else
			tail.nextNode= newest;   //new node after existing tail Pointer(tail.nextNode)
		tail =newest;              //new node becomes the tail
		size++;
	}
}

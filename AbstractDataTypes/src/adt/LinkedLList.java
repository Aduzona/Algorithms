package adt;

//import adt.LinkedList.Node;

public abstract class LinkedLList<E> implements List<E> { //Error show while writing like this: public class LinkedLList implements List<E> 
//public abstract class LinkedLList<E> implements List<E> 
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
	}
	
	private Node<E> head;  //dummy head node
	private int length;    //# of items in the List
	
	public void LinkedLList() { //constructs a list that is initially empty.
		head = new Node<> (null, null);   //create header
		length = 0;                        //number of elements in the list
		
	}
	
	public boolean isFull(){
		return false;
	}
	
	//private Node<> getNode(int i)
	//slide 50
	private Node<E> getNode(int i){ //private helper method for getting i which contains the element and nextNode location
		Node<E> currentNode =head; // to start with the dummy head node
		int index=-1;
		while (index < i) {
			index++;
			currentNode=currentNode.nextNode;
		}
		return currentNode;
	}
	
	//Method public boolean addItem(E item, int i)
	//slide 58
	
	public boolean addItem(E item, int i) {
		if (i <0 || i> length)
			return false;
		
		Node<E> newNode =new Node<>(item, null); //create a new node
		Node<E> prevNode = getNode(i -1); //get node at index i-1
		newNode.nextNode = prevNode.nextNode; //newNode point to the next node of prevNode
		prevNode.nextNode = newNode;           //prevNode point to NewNode
		
		length++;
		return true;
	}
	
	//Method public E removeItem(int i)
	
	public E removeItem(int i) {
		if(i<0 || i>length)
			return null;
		
		Node<E> prevNode=getNode(i-1);   //get node at index i-1
		Node<E> next=getNode(i+1);
		E removed =prevNode.nextNode.item;  //get item of the node at index i
		prevNode.nextNode=next;       //prevNode.nextNode.next;  //prevNode point to Node of index i+1
		
		length--;
		return removed;
             
	}
}

package adt;

public class Node<E> {// data type E is applicable to all method in the Class Node.

	private E item;//reference to the stored at this node
	private Node<E> nextNode; //reference to the subsequent node in the list
	
	public Node() {
		this(null,null);
	}

	public Node(E element, Node<E> next) {
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

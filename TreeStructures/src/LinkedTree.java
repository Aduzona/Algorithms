
public class LinkedTree<E> {

	private class Node<E> {      
		private E       item;   // the item stored       
		private int     key;    // the key field       
		private Node<E> left;   // reference to the left child      
		private Node<E> right;  // reference to the right child      
		private Node(int key, E element, Node<E> leftChild, Node<E> rightChild) {          
			this.key  = key;          
			this.item = element;          
			left      = leftChild;           
			right     = rightChild;        
			}      
		
		private Node(int key, E element) {          
			this(key, element, null, null);       
			}
		
		
	}
	
	private Node<E> root;    
	public LinkedTree() { 
		root = null; 
		}    
	public E search (int key){      
		Node<E> node = searchTree (root, key);       
		if (node == null)          
			return null;       
		else          
			return node.item;    
		}    
	
	private  Node<E> searchTree(Node<E> root, int key) //error cannot make static reference to non static type.
	{    

		if(root.key==key)
			System.out.println(root.item);
		else if(root.key<key)
			searchTree(root.left,root.key);
		else
			searchTree(root.right,root.key);
		 
		return root;
	} 
	
	public void insert (int key, E element){      
		Node<E> parent  = null;           
		Node<E> toCheck = root;       
		
		while (toCheck != null) {     //find the parent of the node         
			if (toCheck.key == key) {  //node with the key exist            
				toCheck.item = element; //change item of the node                   
						}         
			parent = toCheck;          
			if (key < toCheck.key)             
				toCheck = toCheck.left;         
			else             
				toCheck = toCheck.right;       
			}
			
		
	}
	
	public E delete (int key){       
		Node<E> parent   = null;           
		Node<E> toDelete = root;       
		while (toDelete != null && toDelete.key != key) { //find the node to be deleted          
			parent = toDelete;          
			if (key < toDelete.key)             
				toDelete = toDelete.left;          
			else             
				toDelete = toDelete.right;       
			}       
		if (toDelete == null)          
				return null;       
		else          
			 //delete the node and return the item   
		
	}
}

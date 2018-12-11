//Slide 26
public class BTree<E> {

	private E        item   = null;      // the item stored   
	private BTree<E> parent = null;      // reference to the parent node    
	private BTree<E> left   = null;      // reference to the left child   
	private BTree<E> right  = null;      // reference to the right child 
	
	public BTree(E element) {            // constructor for a new tree 
		item = element;  
	}
	public BTree(E element, BTree<E> leftChild, BTree<E> rightChild) {       
		item  = element;      
		left  = leftChild;       
		right = rightChild;        
		if (left!=null ) leftChild.parent  = this;   //Does this mean that it is it's own left child?    
		if (right!=null) rightChild.parent = this;  //Does this mean that it is it's own rightChild?  
		
	}
	
	private Boolean isRoot() { 
		return this.parent==null; 
		}                                   
	public BTree<E> getRoot( ) {       
		BTree<E> node = this;             //current tree       
		while ( !node.isRoot() )          
			node = node.getParent();      
		return node;   
		
	}
	
	public BTree<E> addLeft(BTree<E> tree) {    
		BTree<E> oldLeftChild = left;  //current left child                       
		left = tree;  //new left child      
		if ( tree != null )         
			tree.parent=this;     
		if ( oldLeftChild != null )        
			oldLeftChild.parent=null;      
		return oldLeftChild;    
	}
	
	public BTree<E> addRight(BTree<E> tree) {       
		BTree<E> oldRightChild = right;  //current left child                        
		right = tree;   //new left child      if ( tree != null )          
		tree.parent=this;      
		if ( oldRightChild != null )         
			oldRightChild.parent=null;       
		return oldRightChild;    
	}

}

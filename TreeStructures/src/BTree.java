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

	public void preorderPrint() {        
		BTree<E> root = this.getRoot();      
		preorderPrintTree(root);    
		}
	
	private void preorderPrintTree(BTree<E> root) {   
		System.out.print(root.item + "");     
		if (root.left != null)         
			preorderPrintTree(root.left);       
		if (root.right != null)          
			preorderPrintTree(root.right);    
		}
	
	public void postorderPrint() {      
		BTree<E> root = this.getRoot();       
		postorderPrintTree(root);   
		}    
	
	private void postorderPrintTree(BTree<E> root) {      
		if (root.left != null)          
			postorderPrintTree(root.left);       
		if (root.right != null)          
			postorderPrintTree(root.right);       
		System.out.print(root.item + " ");   
		}
	
	public void inorderPrint() {       
		BTree<E> root = this.getRoot();       
		inorderPrintTree(root);    
		}    
	
	private void inorderPrintTree(BTree<E> root) {       
		if (root.left != null)          
			inorderPrintTree(root.left);       
		System.out.print(root.item + " ");       
		if (root.right != null)          
			inorderPrintTree(root.right); 
		}
	
	public void levelOrderPrint() {       
		BTree<E> root = this.getRoot();       
		levelOrderPrintTree(root);    
		}   
	
	private void levelOrderPrintTree(BTree<E> root) {       
		Queue< BTree<E> > treeQueue = new Queue< Btree<E> >(); //create a queue for nodes       
		treeQueue.enqueue(root);                               //enqueue root      
		while (!treeQueue.isEmpty()){              //is queue empty?         
			BTree<E> node = treeQueue.dequeue();    //removes first node from the queue          
			System.out.print(root.item + " ");         
			if (node.left != null)             
				treeQueue.enqueue(node.left);        //add leftChild to queue          
			if (node.right != null)             
				treeQueue.enqueue(node.right);       //add rightChild to queue     
			}   
		} 
		}
	}
}

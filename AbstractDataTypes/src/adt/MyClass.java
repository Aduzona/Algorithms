package adt;
//slide 70
public class MyClass extends LinkedLList<E> {
	

	public static int numOccur(List l, E item) {      
		int numOccur = 0;       
		for (int i = 0; i < l.length(); i++) {         
			E itemAt = l.getItem(i);         
			if (itemAt.equals(item))             
				numOccur++;       
			}      
		return numOccur;    
		} 
	
	public static int numOccur(LinkedLList list, E searchItem) {      
		int numOccur = 0;      
		Node travNode = list.getNode(0);      
		while(travNode != null)         
			E itemAt = travNode.getItem();          
		if (itemAt.equals(searchItem))             
			numOccur++;          
		travNode = travNode.getNextNode();      
		       
	return numOccur;    
	}
	
	public static int numOccur(LinkedLList list, E searchItem) {       
		int numOccur = 0; 
		ListIterator iter = list.iterator();      
		while(iter.hasNext())         
			E itemAt = iter.next()          
			if (itemAt.equals(searchItem))            
				numOccur++;            
	return numOccur;   
	}
}

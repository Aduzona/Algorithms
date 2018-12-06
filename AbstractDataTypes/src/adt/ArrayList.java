package adt;

public abstract class ArrayList<E> implements List<E> {
    private E[] items; //generic array used for storage
    private int length; //current number of elements
	private E[] data;
    
    @SuppressWarnings("unchecked")
	public ArrayList(int maxSize) { //constructs list with given capacity
    	items=(E[]) new Object[maxSize];  //safe cast; compiler may give warning
    	length =0;
    }
	

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (length == items.length);
	}
	
	//adding at position i(shifting items i, i+1, = to the right by one
	
	public boolean addItem(E item, int i) {
		if(i <0 || i>length)   //not enough capacity
			return false;
		if (isFull())
			return false;
		for(int j = length-1; j>=i; j--)   //start by shifting rightmost
			items[j+1]=items[j];
		items[i] =item;                 //ready to replace the new element
		length++;
		return true;
	}
    
	//removing from position i(shifting items i, i+1, = to the left by one):
	
	public E getItem(int i) {
		return items[i];
	}
	
	public E removeItem(int i) {
		E temp = data[i];   //I don't see the reason for creating another variable data, why not use items
		for(int k=i; k<length-1; k++)   //shift elements to fill hole
			items[k] = items[k+1];
		//items[size-1]=null;    //help garbage collection
		items[i+1]=null;    //help garbage collection , my own addition
		length--;
		return temp;
	}
}

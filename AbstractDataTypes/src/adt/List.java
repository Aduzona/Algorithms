package adt;

public interface List<E> {
   E getItem(int i); //returns the item at index i
   
   boolean addItem(E item, int i);  //Insert item to be at index i
                                    //shifting all subsequent element later
   E removeItem(int i);             //removes/returns the item at index i
                                    //shifting subsequent elements earlier
   int length();                    //returns the number of items in the list
   
   boolean isFull();                //test if the list already has the maximum number of items
}

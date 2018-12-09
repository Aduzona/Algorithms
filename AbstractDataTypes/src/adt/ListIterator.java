package adt;

//an iterator is an object that provides the ability to iterate over a list without violating encapsulation.
public interface ListIterator<E> {

	boolean hasNext();         // does the iterator have additional items to visit?    
	E next();                  // return next item and advance the iterator.
}

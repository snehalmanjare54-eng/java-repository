package SDMCollectionFramework;

public interface ListIterator {
	// 8 Methods
	boolean hasNext( );
	boolean hasPrevious( );
	Object next( );
	int nextIndex( );
	Object previous( );
	int previousIndex ( );
	void remove( );
	void set(Object obj); 
}

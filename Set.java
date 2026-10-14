package SDMCollectionFramework;

public interface Set {
	//6 Methods
	Object first( );
	Object last( );
	void comparator( );
	SortedSet headSet(Object end);
	SortedSet subSet(Object start, Object end);
	SortedSet tailSet(Object start); 
}

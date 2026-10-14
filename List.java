package SDMCollectionFramework;

public interface List {
	// 10 Methods
	void add(int index, Object obj);
	boolean addAll(int index,Collection c);
	Object get(int index);
	int indexOf(Object obj);
	int lastIndexOf(Object obj);
	void listIterator( );
	void listIterator(int index);
	Object remove(int index);
	Object set(int index, Object obj);
	List subList(int start, int end); 
	

}

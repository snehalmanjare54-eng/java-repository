package SDMCollectionFramework;

public interface Map {
	// 14 Methods
	void clear( );
	boolean containsKey(Object k);
	boolean containsValue(Object v);
	Set entrySet( );
	boolean equals(Object obj);
	Object get(Object k);
	int hashCode( );
	boolean isEmpty( );
	Set keySet( );
	Object put(Object k, Object v);
	void putAll(Map m);
	Object remove(Object k);
	int size( );
	Collection values( ); 
}

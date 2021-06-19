import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/*
 * Example of values() method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Cat");
		treeMap.put(2, "Dog");
		treeMap.put(4, "Apple");
		treeMap.put(3, "Ball");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Returns a Collection view of the values contained in this map. The
		 * collection is backed by the map, so changes to the map are reflected
		 * in the collection, and vice-versa.
		 * 
		 * If the map is modified while an iteration over the collection is in
		 * progress (except through the iterator's own remove operation), the
		 * results of the iteration are undefined. The collection supports
		 * element removal, which removes the corresponding mapping from the
		 * map, via the Iterator.remove, Collection.remove, removeAll, retainAll
		 * and clear operations. It does not support the add or addAll
		 * operations.
		 */
		Collection<String> collection = treeMap.values();

		System.out.println("collection : " + collection + "\n");

		for( Iterator<String> iterator = collection.iterator(); iterator
		        .hasNext(); )
		{
			String value = iterator.next();
			System.out.println(value);
		}
	}
}

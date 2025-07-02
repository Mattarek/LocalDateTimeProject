package current_2025_czerwiec.Nulls;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Nulls {
	public static void main(final String[] args) {
		//		final Map<String, Integer> treeMap = new TreeMap<>();
		//		treeMap.put("1", 1);
		//		treeMap.put("2", 2);
		//		treeMap.put("3", 3);
		//		treeMap.put("4", 4);
		//		// Nie wiadomo jak sortować nulla
		//		// treeMap.put(null, 4); // NullPointerException
		//		System.out.println(treeMap);
		//
		//		//================================================
		//		final Hashtable<Integer, String> hashtable = new Hashtable<>();
		//		hashtable.put(1, "1");
		//		// również nie zezwala na nulla jako klucz
		//		//		hashtable.put(null, "2"); // NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
		//		//		hashtable.put(3, null); // Wartość też nie może być nullem: NullPointerException
		//		System.out.println(hashtable);
		//
		//		//===================================================
		//		final Set<Integer> treeSet = new TreeSet<>();
		//		treeSet.add(1);
		//		treeSet.add(2);
		//		// Nie pozwala, aby wartość była nullem
		//		//		treeSet.add(null); // NullPointerException
		//		System.out.println(treeSet);
		//
		//		//=====================================================
		//		final Queue<String> queue = new ArrayDeque<>();
		//		queue.offer("123");
		//		//		queue.offer(null); // NullPointerException, kolejka też nie może mieć nulla

		final Set<Integer> treeSet = new TreeSet<>(Comparator.nullsFirst(Comparator.naturalOrder()));

		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(null);
		treeSet.add(4);
		treeSet.add(5);
		System.out.println(treeSet);
	}
}


package com.fdmgroup.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class CollectionsPrintUtility {

	
	
	public static void printCollection(Collection<?> collection) {
		
		Iterator<?> iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	public static void printCollection(Map<?, ?> collection) {
		
		for (Object key : collection.keySet()) {
			Object value = collection.get(key);
			System.out.println("Key = " + key + ", value = "+ value);
		}
	}
	
}

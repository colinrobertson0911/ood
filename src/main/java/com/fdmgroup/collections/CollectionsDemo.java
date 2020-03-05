package com.fdmgroup.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {

		//ArrayList allows duplicates and nulls, and it is ordered 
		List<String> arrayListExample = new ArrayList<>();
		arrayListExample.add("First string");
		arrayListExample.add("Second string");
		arrayListExample.add(null);
		arrayListExample.add("Second string");
		
		//CollectionsPrintUtility.printCollection(arrayListExample);
		
		//hashSet allows no duplicates , one null, not ordered
		Set<String> hashSetExample = new HashSet<>();
		hashSetExample.add("hashSet 1");
		hashSetExample.add("hashSet 2");
		hashSetExample.add(null);
		hashSetExample.add(null);
		hashSetExample.add("hashSet 2");
		
		//CollectionsPrintUtility.printCollection(hashSetExample);
		
		//TreeSet allows no duplicates or nulls, and is sorted
		SortedSet <Integer> sortedSetExample = new TreeSet<>();
		sortedSetExample.add(5);
		sortedSetExample.add(3);
		//sortedSetExample.add(null);
		sortedSetExample.add(3);
		sortedSetExample.add(1);
		
		//CollectionsPrintUtility.printCollection(sortedSetExample);
		
		//HashMap allows no duplicates, one null, sorted
		User user1 = new User(1, "Mark", "Lancaster");
		User user2 = new User(2, "June", "McPake");
		User user3 = new User(3, "David", "Cuthill");
		
		Map<Integer, User> mapExample = new HashMap<>();
		mapExample.put(user2.getId(), user2);
		mapExample.put(user1.getId(), user1);
		mapExample.put(user2.getId(), user2);
		mapExample.put(null, null);
		mapExample.put(user3.getId(), user3);
		
		CollectionsPrintUtility.printCollection(mapExample);
		
	}

}

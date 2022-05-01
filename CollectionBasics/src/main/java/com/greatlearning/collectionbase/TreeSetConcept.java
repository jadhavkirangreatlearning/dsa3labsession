package com.greatlearning.collectionbase;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		Set<String> hashSet = new TreeSet<String>();

		hashSet.add("IT");
		hashSet.add("77");
		hashSet.add("MECHANICAL");
		hashSet.add("IT");
		hashSet.add("PETROLIUM");
		hashSet.add("11");
		hashSet.add("CHEMICAL");

		hashSet.forEach(System.out::println);
	}

}

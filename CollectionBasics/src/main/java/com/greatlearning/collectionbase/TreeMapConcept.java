package com.greatlearning.collectionbase;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
	public static void main(String[] args) {

		Map<String, String> hMap = new TreeMap<String, String>();

		hMap.put("ID", "121");
		hMap.put("NAME", "ADITI");
		hMap.put("SALARY", "4567777.89");
		hMap.put("ADDRESS", "NCR");

		for (Map.Entry<String, String> m : hMap.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}

	}

}

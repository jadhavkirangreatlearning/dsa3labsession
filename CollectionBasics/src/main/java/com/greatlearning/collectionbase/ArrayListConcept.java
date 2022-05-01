package com.greatlearning.collectionbase;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		List<String> branchNameList = new ArrayList<String>();

		branchNameList.add("IT");
		branchNameList.add("CIVIL");
		branchNameList.add("MECHANICAL");
		branchNameList.add("IT");
		branchNameList.add("ELECTRONICS");

		for (String branchName : branchNameList) {
			//branchNameList.remove(2);

			System.out.println(branchName);
		}

	}

}

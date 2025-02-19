package com.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsomorphicStrings {

	private static Logger logger = Logger.getLogger(IsomorphicStrings.class.getName());

	public static void main(String[] args) {
		String str1 = "aac";
		String str2 = "xxz";
		logger.log(Level.INFO, "isomorphic: {0}", areIsomorphic(str1, str2));
	}

	public static boolean areIsomorphic(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		Map<Character, Character> countMap = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if (countMap.containsKey(c)) {
				if (countMap.get(c) != str2.charAt(i)) {
					return false;
				}
			} else if (!countMap.containsValue(str2.charAt(i))) {
				countMap.put(str1.charAt(i), str2.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}

}

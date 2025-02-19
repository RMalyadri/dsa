package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AngramWordList {

	public static void main(String[] args) {
		String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
		anagramUsingStream(arr);
		System.out.println(anagramUsingMap(arr));
		anagramUsingHash(arr);
	}
	
	
	private static void anagramUsingHash(String[] arr) {
		Arrays.stream(arr).collect(Collectors.groupingBy(
				AngramWordList::getHash,
				LinkedHashMap::new,
				Collectors.toList()
				)).forEach((k,v) -> System.out.println(k+","+v));
	}
	
	private static String getHash(String word) {
		char[] primes = new char[26];
		for(char c : word.toCharArray()) {
			primes[c-'a']++;
					
		}
		return String.valueOf(primes);
		
	}
	
	private static void anagramUsingStream(String[] arr) {
		Arrays.stream(arr).collect(
				Collectors.groupingBy(key -> {
					char[] c = key.toCharArray();
					Arrays.sort(c);
					return String.valueOf(c);
				}))
		.entrySet().stream().filter(map -> map.getValue().size() > 1)
		.forEach(map -> System.out.println(map.getValue()));
		
		Arrays.stream(arr).collect(
				Collectors.groupingBy(key -> {
					char[] c = key.toCharArray();
					Arrays.sort(c);
					return String.valueOf(c);
				}))
		.entrySet().stream().filter(map -> map.getValue().size() > 1)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	public static Map<String, List<String>> anagramUsingMap(String[] arr){
		Map<String, List<String>> map = new HashMap<>();
        Arrays.stream(arr).forEach( str -> {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        });
        return map;
	}

}

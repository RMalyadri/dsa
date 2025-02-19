package com.dsa;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatUniChar {

	public static void main(String[] args) {
		String s="programming";
	    Map<Character,Long> countChar = s.chars().mapToObj(icv -> (char)icv).collect(
	    		Collectors.groupingBy(Function.identity(),
	    		LinkedHashMap<Character,Long>::new,	
	    		Collectors.counting()));
	    System.out.println(countChar);
	    countChar.entrySet().stream().filter(ent -> ent.getValue() > 1).
	    forEach(enty -> System.out.println(enty.getKey()));
	    Character key = countChar.entrySet().stream().filter(ent -> ent.getValue() <= 1)
	    .findFirst().orElse(Map.entry('&', 1L)).getKey();
	    System.out.print(key);
	    
	    List<Integer> intList = Arrays.asList(2,3,4,4,1,5,3);
	    System.out.println("after%%%%%%%");
	    String sort = s.chars().mapToObj(ch -> (char)ch)
	    		 .sorted()
	            .map(String::valueOf)
	    		.collect(Collectors.joining());
	    System.out.println(sort);
	    
	    String st1 = "abc";
	    String st2 = "abc";
	    
	    if(st1 == st2) {
	    	System.out.println("both are equal");
	    	
	    }
	    
	    
	    
	    
	    
	}

}

package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatUniqu {

	public static void main(String[] args) {
		 String s = "AAnish";
		char firUniqu = s.chars().mapToObj(c -> (char)c)
		 .collect(Collectors.groupingBy(Character::charValue,
				 LinkedHashMap::new,
				 Collectors.counting()
				 )).entrySet().stream().filter(map -> map.getValue() ==1)
		 .findFirst().map(Map.Entry::getKey).orElse('\u0000');
		 System.out.println(firUniqu);
		 
		 
		 

	}

}

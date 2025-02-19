package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class VowelCount {

	public static void main(String[] args) {
		String str ="mali";
		str.chars().mapToObj(is ->(char)is)				
				.filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
				.forEach(chp -> System.out.println(chp+","+str.indexOf(chp)));
				//.count();
		//System.out.println(ct);
		//accessing index base
		IntStream.range(0,str.length())
				.filter(i -> "aeiou".indexOf(str.charAt(i)) != -1)
				.forEach(i -> System.out.println(str.charAt(i)+","+i));
		
		
		str.chars().mapToObj(ch -> (char)ch)
		.filter(ic -> "aeiouAEIOU".indexOf(ic) > -1)
		.forEach(pc -> System.out.println(pc));
		String vowels = "aeiouAEIOU";
	    

	}

}

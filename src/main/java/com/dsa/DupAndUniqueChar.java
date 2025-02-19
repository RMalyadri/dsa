package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupAndUniqueChar {

	public static void main(String[] args) {
		String s = "malyadri";
		Map<String,Long> countMap = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		String uniqu = countMap.entrySet().stream().filter(en -> en.getValue() == 1)
				.map(me -> me.getKey().toString())
				.collect(Collectors.joining());
				//.map(me -> me.getKey().toString()).reduce("",(a,b)-> a.concat(b));
		System.out.println(uniqu);

	}

}

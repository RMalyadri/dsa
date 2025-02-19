package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Miscellanious {

	public static void main(String[] args) {
		
		int[] ar = {1,2,3};
		for(int i : ar) {
			System.out.println(i);
		}
		

		Map<String, String> map = new HashMap<>();
		Predicate<Integer> inPred = a -> a > 1;
		Consumer<Integer> inCon = val -> System.out.println(val);
		Supplier<Miscellanious> inSup = Miscellanious::new;
		Function<Integer, String> inStrFun = (a) -> String.valueOf(a);
		Comparator<Emp> empco = Comparator.comparing(Emp::dept);
		

		Deque<Integer> deque = new LinkedList<>();

		map.put("k", "val");
		deque.add(1);
		deque.add(2);
		deque.add(3);
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		Queue<Integer> qeque = new LinkedList<>();
		qeque.add(1);
		qeque.add(2);
		System.out.println(qeque.poll());
		int[] nums = { 1, 1, 1, 2, 3, 3, 6, 6, 7 };
		int[] unique = Arrays.stream(nums).distinct().toArray();
		System.out.println("unique ele");
		Arrays.stream(unique).forEach(System.out::println);
		String s = "ma123c";
		
		String news = s.chars().mapToObj(ic -> (char) ic).filter(Character::isLetter).map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(news);
		Stream<List<String>> sls = Stream.of(Arrays.asList("a", "b"), Arrays.asList("a", "b"));
		List<String> value = sls.flatMap(st -> st.stream()).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(value);
		String a = "abca";
		System.out.print(a.indexOf(a.charAt(3)));
		int five = 0b1101;
		System.out.println(five);
		s = "a";
		System.out.println((int) s.charAt(0));
		List<String> names = Stream.of(Arrays.asList("a", "b"), Arrays.asList("b", "d"))
				.flatMap(strem -> strem.stream()).collect(Collectors.toList());
		System.out.println(names);

		String input = "hello world";
		input.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
				.ifPresent(System.out::println);

		Map<String, String> imMap = Map.of("k1", "v1", "k3", "v3", "k2", "v2");
		String maxKey = imMap.entrySet().stream().max(Map.Entry.comparingByKey()).orElse(Map.entry("", "")).getKey();
		System.out.println(maxKey);

		String sr = "malyadri";
		StringBuilder rs = new StringBuilder();
		for (int i = sr.length() - 1; i >= 0; i--) {
			rs.append(sr.charAt(i));
		}
		System.out.println("strever " + rs.toString());
		identCount();
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> partMap = list.stream().collect(Collectors.partitioningBy(val -> val % 2 == 0));
		System.out.println(partMap);

		List<Integer> l1 = Arrays.asList(1, 5, 2);
		List<Integer> l2 = Arrays.asList(0, 7, 6);
		List<Integer> li = Stream.concat(l1.stream(), l2.stream()).sorted().collect(Collectors.toList());
		String s1 = "acb";
		String s2 = "Abc";
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if (s1.equals(s2)) {
			System.out.println("anagrams");
		}
		String ds = "12345";
		long sum2 = Stream.of(ds.split("")).mapToInt(Integer::parseInt).sum();
		int sum = ds.chars().mapToObj(ch -> (char) ch).map(Character::getNumericValue).reduce(Integer::sum).get();
		System.out.println(sum + "," + sum2);

		String sos = Arrays.stream("maly".split("")).sorted().collect(Collectors.joining());
		System.out.println(sos);
		Integer i1;

		List<String> parentList = new ArrayList<>();
		parentList.add("Name3");
		parentList.add("Name1");
		// Arrays.asList("Name1","Name2","Name3","Name4","Name5","Name6");
		Iterator<String> iter = parentList.iterator();
		while (iter.hasNext()) {
			String ob = iter.next();
			if ("Name1".equals(ob)) {
				iter.remove();
			}

		}

		//IntStream.range(1, 101).forEach(System.out::print);
		
		ds = "12345";

		System.out.println(Stream.of(ds.split("")).mapToInt(Integer::parseInt).sum());
		
		
	}

	private static void identCount() {
		int[] ar = { 1, 2, 2, 3, 2, 1 };
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

		Set<String> set1 = new HashSet<>();
		set1.add("a");
		Set<String> set2 = new HashSet<>();
		set2.add("b");
		if (set1.equals(set2)) {
			System.out.println("set equal");
		} else {
			System.out.println("not set equal");
		}

	}

	boolean foo(int a, int b)
	{
	boolean res;
	res = (a==b);
	res = a!=0 || b==0;
	res = res && a ==0;
	return res;
	}

	private static int sum(int[][] da, int l) {

		for (int i = 0; i < da.length; i++) {
			for (int j = 0; j < da[i].length; j++) {
				System.out.println(da[i][j]);
			}
		}
		return 1;

	}

}

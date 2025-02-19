package com.java8;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Demo {
	
	private static Logger  logger = Logger.getLogger(Java8Demo.class.getName());

	public static void main(String[] args) throws Exception {
	    Map<String,String> empMap = new HashMap<>();
	    empMap.put("D", "4");
	    empMap.put("A", "3");
	    empMap.put("E", "5");
	    empMap.keySet().stream().collect(Collectors.toList());
	    


	    Map<String,String> sorted = empMap.entrySet().stream().sorted(Map.Entry.<String,String>comparingByKey().reversed())
	    .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1,LinkedHashMap::new));
	    System.out.println(sorted);
	    Emp ep = new Emp(1,1000,"IT");
	    List<Emp> employees = new ArrayList<>();
	    employees.add(new Emp(1,1000,"IT"));
	    employees.add(new Emp(2,2000,"IT"));
	    employees.add(new Emp(3,2000.0,"SF"));
	    employees.add(new Emp(4,3000.0,"SF"));
	    //multi field sorting
	    employees.stream().sorted(Comparator.comparing(Emp::dept)
	    		.thenComparing(Emp::sal)).forEach(System.out::println);
	    
	    //max sal emp
	    double max = employees.stream().max(Comparator.comparingDouble(Emp::sal)).orElse(new Emp(0,1,"")).sal();
	    System.out.println(max);
	    //department count	    
	    Map<String,Long> deptCount = employees.stream().collect(Collectors.groupingBy(Emp::dept,Collectors.counting()));
	    System.out.println(deptCount);
	    //depart sum
	    Map<String,DoubleSummaryStatistics> deptSum = employees.stream().collect(Collectors.groupingBy(Emp::dept,
	    		Collectors.summarizingDouble(Emp::sal)));
	    //department highest emp
	    Map<String,Optional<Emp>> deptMaxSal =  employees.stream().collect(
	    		Collectors.groupingBy(Emp::dept, Collectors.maxBy(Comparator.comparingDouble(Emp::sal))));
	    System.out.println(deptMaxSal);
	    
	    
	    Map<String,List<Emp>> groupEmp = employees.stream().collect(Collectors.groupingBy(r1 -> r1.dept()));
	    System.out.println(groupEmp);
	    List<String> al = Arrays.asList("a","b","ab");
	    Map<Integer,Long> lengthGroup = al.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
	    System.out.println(lengthGroup);
	   
	    int[] ia = {2,3,4,5};
	    long co = Arrays.stream(ia).filter(x -> x%2==0).count();
	    logger.log(Level.INFO, "count: {0}",co);
	    String s ="ma Ma test test MA";
	    Map<String,Long> cm = Arrays.stream(s.split(" "))	    
	    .collect(Collectors.groupingBy(String::toUpperCase,Collectors.counting()));
	    System.out.println(cm);
	    
	    String ls = "I am interested123455 to grow in my organization";
	    String maxStri = Arrays.stream(ls.split(" ")).sorted(Comparator.comparingInt(String::length).reversed())
	    .skip(1).findFirst().orElse("");
	    System.out.println(maxStri);
	    
	    
	    List<Role> roles = Arrays.asList(new Role("a","s"),new Role("a","b"),new Role("c","v"));
	    Map<String,List<String>> roleMap = roles.stream()
	    		.collect(Collectors.groupingBy(Role::userName, Collectors.mapping(Role::roleDesc, Collectors.toList())
	    				));
	    //{a=s,}
	    Map<String,String> roleUMap = roles.stream()
	    		.collect(Collectors.toMap(Role::userName, Role::roleDesc,(e1,e2) -> e1));
	    System.out.println(roleUMap);
	    
	    String words = "New York City, the most populous city in the United States, located in the state of NEW YORK";
	    Arrays.stream(words.split(" "))
	    .filter(wd -> wd.length() <=5 && wd.length() > 0 )
	    .map(String::toUpperCase)
	    .collect(Collectors.toSet())
	    .forEach(System.out::println);
	    //sum of digits
	    
	    int i = 236839;
	    int sum = String.valueOf(i).chars()
	    .mapToObj(ch -> (char)ch)
	    .mapToInt(Character::getNumericValue)
	    .sum();
	   
	    System.out.println(sum);
	    String ab = "236839";
	    ab.chars()
	    .mapToObj(ch -> (char)ch)
	    .map(String::valueOf)
	    .map(Integer::parseInt)
	    .reduce(Integer::sum).ifPresent(System.out::println);
	    
	    i = 236839;
	    int sum5 = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
	   
	    List<Integer> myList = Arrays.asList(2,5,3,2,8);
	    //sum 
	    int sum2 = myList.stream().mapToInt(Integer::intValue).sum();
	    System.out.println(myList.stream().mapToInt(x -> x).sum());
	    myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	    .forEach((k,v) -> System.out.println(k+","+v));
	    myList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
	    .ifPresent(System.out::println);
	    
	    myList.stream().map(x -> x*x*x)
	    .filter(x -> x > 50)
	    .sorted(Comparator.reverseOrder())
	    .forEach(System.out::println);
	    
	    Set<String> unq = new HashSet<>();
	    Set<String> dp = new HashSet<>();
	    List<String> list1 = Arrays.asList("a","b","c");
	    List<String> list2 = Arrays.asList("a","d","c");
	    Stream.of(list1,list2)
	    .flatMap(str -> str.stream())
	    .filter(v -> !unq.add(v))
	    .forEach(System.out::println);
	    
	    
	    list1.stream().filter(list2::contains).forEach(System.out::println);
	    
	    List<String> emailList = Arrays.asList("a@epam.com","b@epam.com","c@epam.com","d@google.com");
	   emailList.stream()
	    .map(e -> e.split("@")[1])
	    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	    .forEach((k,v) -> System.out.println(k+","+v));
	   
	   Character c = "welcome to java".chars().mapToObj(ch -> (char)ch)
			   .collect(Collectors.groupingBy(Function.identity(),
					   LinkedHashMap::new,
					   Collectors.counting()))
			   .entrySet().stream()
			   .filter(map -> map.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse('\u0000');
	    
	    
	    System.out.println(c);
	    
	    String os = "";

	    String val = Optional.ofNullable(os).map(x -> {
	    	System.out.println("not null");
	    	return "xx";
	    }).orElseThrow(() -> new Exception("exception") );
	    
	    System.out.println(val);
	    int[] arr = {3,6,8,9,4};
	    int sum3 = Arrays.stream(arr).filter(x -> x%2==0).sum();
	    System.out.println(sum3);
	    List<List<Integer>>  nesList = Arrays.asList(Arrays.asList(1,2,4),Arrays.asList(1,4,4));
	   int nestSum = IntStream.concat(IntStream.of(1,2,4), IntStream.of(1,4,4))
			   .sum();
	   System.out.println(nestSum);
	   
	   int arr2[] = {1, 2, 2, 0, 4, 3, 0, 0, 1, 1};
	   Arrays.stream(arr2).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			   .forEach((k,v) -> System.out.println(k+","+v));
	   
	  
	    
	   System.out.println(Arrays.stream(arr2).max().getAsInt());
	   //
	   List<Furniture> furniture  = new ArrayList<>();
	   furniture.add(new Furniture(Material.GLASS, "wind"));
	   furniture.add(new Furniture(Material.WOOD, "log"));
	   furniture.stream().filter(fun -> fun.getMaterial().equals(Material.WOOD))
	   .findFirst().map(fum -> fum.getName().toUpperCase()).ifPresent(System.out::println);
	  
	   furniture.stream().filter(fum -> fum.getMaterial().equals(Material.GLASS))
	   
	   .findFirst().map(fm -> fm.getName().toUpperCase())
     .ifPresent(System.out::println);
	   System.out.println("$$$$$$$$$$$$444");
	   String text = "This is a sample text. The text may contain words, punctuation, and spaces. This sample text is for testing.";
	   Arrays.stream(text.split(" "))
	   .map(str -> str.replace(".", ""))
	   .map(str -> str.replace(",", ""))
	   .collect(Collectors.groupingBy(Function.identity(),
			   Collectors.counting())).entrySet().stream()
	   .sorted(Map.Entry.<String,Long>comparingByValue().reversed()
			   .thenComparing(Map.Entry.comparingByKey())
			   )
	   .forEach(map -> System.out.println(map.getKey()+" -> "+map.getValue()));
	   
	   
	   String inSt = "I am interested123455 to grow in my organization";
		Arrays.stream(s.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst()
		.ifPresent(System.out::println);
		
		Arrays.asList("apple","mango","apple","guava","pineapple","guava","apple")
		.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((k,v) -> System.out.println(k+","+v));
	   
	   
	   String rgs = "madridr.";
	   System.out.println("reg==> "+rgs.replaceAll("", ""));
	   if(rgs.matches("^[^a-zA-Z0-9]*$")) {
		   System.out.println("matched");
	   }else {
		   System.out.println("not matched");
	   }

	   Integer i1=129;
	   Integer i2=129;
	   if(i1==129) {
		   System.out.println("equest");
	   }

	   
	}
	
	
	

}

class Furniture { 

    Material material;
    String name;
    
    public Furniture(Material material, String name) {
    	this.material = material;
    	this.name = name;
    }

    public Material getMaterial() { 
        return material; 

    }

    public String getName() { 
        return name; 
    }

}
enum Material {WOOD, GLASS, OTHER} 
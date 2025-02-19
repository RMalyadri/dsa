package com.java8;
import java.util.stream.IntStream;

public class VovelCount {
	
    public static void main(String[] args) {
        String s = "This is java bench group";
        IntStream.range(0, s.length())
                .filter(i -> "aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                .forEach(i -> System.out.println(s.charAt(i) + " = " + i));
    }
}


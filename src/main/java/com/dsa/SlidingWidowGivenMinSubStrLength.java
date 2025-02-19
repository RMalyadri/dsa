package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashMap;

public class SlidingWidowGivenMinSubStrLength {
	
	private static Logger logger = System.getLogger(SlidingWidowGivenMinSubStrLength.class.getName());

	public static void main(String[] args) {
		String s = "ADOBECODEBANC", t = "ABC";
		logger.log(Level.INFO, getMinWindowString(s,t));
	}
	
	private static String getMinWindowString(String s, String t) {
		if(t.length() > s.length() ) {
			return "";
		}
		HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int formed  = 0;
        int min = Integer.MAX_VALUE;
        int minLeft = 0;
        HashMap<Character, Integer> winMap = new HashMap<>();
        while(right < s.length()) {
        	char c = s.charAt(right);
        	winMap.put(c, winMap.getOrDefault(c, 0) + 1);
        	if(tMap.containsKey(c) && tMap.get(c).intValue()== winMap.get(c).intValue()) {
        		formed++;
        	}
        	while(left <= right && formed == tMap.size()) {
        		char lc = s.charAt(left);
        		if(right-left+1 < min) {
        			min = right-left+1;
        			minLeft = left;
        		}
        		winMap.put(lc, winMap.get(lc).intValue()-1);
        		if(tMap.containsKey(lc) && tMap.get(lc).intValue() >  winMap.get(lc).intValue()){
        			formed--;
        		}    		
        		left++;        		
        	}
        	right++;
        }
        return min == Integer.MAX_VALUE ? "":s.substring(minLeft,min+minLeft);
	}

}

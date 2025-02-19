package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HighestFrequencySubArr {

	public static void main(String[] args) {
		int[] nums = {1,1,3,3,2,5,7,6,1,10,11,13,2,2};  
		//System.out.println(getShortestSubarray(nums));
		//System.out.println(getShortPathSec(nums));
		System.out.println(usingSlidingWindow(nums));
		
	}
	
	private static String usingSlidingWindow(int[] nums) {
		Map<Integer,Long> frequecen = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		long fre = frequecen.entrySet().stream()
		         .map(Map.Entry::getValue)
		         .max(Comparator.comparingLong(Long::longValue))
		         .orElse(0L);
		int[] hfList = frequecen.entrySet().stream().filter(me -> me.getValue() == fre)
		.map(Map.Entry::getKey).mapToInt(x -> x).toArray();
		int l = 0;
		int r = 1;
		int minLen = Integer.MAX_VALUE;
		int leftInd = 0;
        int righInd = 0;
		while(r < nums.length) {
			if(hfList[1] == nums[r] ) {
				while(l < r) {
					if(hfList[0] == nums[l] && minLen > r-l+1) {
							minLen = r-l+1;
							leftInd = l;
							righInd = r;
					}
					l++;
				}
			}
			r++;
		}
		return Arrays.stream(nums).boxed().skip(leftInd).limit(righInd-leftInd+1).map(String::valueOf).collect(Collectors.joining(","));
				
		
	}
	public static String getShortPathSec(int[] nums){
		Map<Integer,Long> freqCount = Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
		long highestFeq = freqCount.entrySet().stream().max(Map.Entry.comparingByValue())
				.orElse(Map.entry(-1, 1L)).getValue();
	    List<Integer> higFreList = freqCount.entrySet().stream()
	    		.filter(enr -> enr.getValue() == highestFeq).map(Map.Entry::getKey)
	    		.toList();
	    		//.collect(Collectors.toList());
		int start = 0;
		int end = nums.length-1;
		Map<Integer,String> indexMap = new HashMap<>();
		while(start < end) {
			if(nums[start] != higFreList.get(0)) {
			   start++;
			   continue;
			}
			if(nums[end] != higFreList.get(1)) {
				end--;
				continue;
			}
			String sub = Arrays.stream(nums).boxed().skip(start)
					.limit(end-start+1)
			.map(String::valueOf)		
			.collect(Collectors.joining(","));
			indexMap.put(end-start, sub);	
			start++;
			end--;
		}
	    return indexMap.entrySet().stream()	    		
	    		.min(Map.Entry.comparingByKey())	    		
	    		.map(Map.Entry::getValue).orElse("[-1,-1]");
	}
	
	public static List<Integer> getShortestSubarray(int[] nums) {
	    List<Integer> smallest = new ArrayList<>();
	    int highestFrequency = 1;
	    Map<Integer, Integer> frequencies = new HashMap();

	    for(int i: nums) {
	        smallest.add(i);
	        if(!frequencies.containsKey(i)) frequencies.put(i, 0);
	        frequencies.put(i, frequencies.get(i)+1);

	        highestFrequency = Math.max(highestFrequency, frequencies.get(i));
	    }

	    Set<Integer> elements = new HashSet<>();
	    Iterator<Map.Entry<Integer, Integer>> it = frequencies.entrySet().iterator();
	    while(it.hasNext()) {
	        Map.Entry<Integer, Integer> entry = it.next();
	        if(highestFrequency == entry.getValue()) {
	            elements.add(entry.getKey());
	        }
	    }

	    int l = 0;
	    int r = 0;

	    Set<Integer> el = new HashSet<>(elements);
	    List<Integer> list = new ArrayList<>();
	    while(l < nums.length) {
	        list.add(nums[r]);
	        if(el.contains(nums[r])) {
	            el.remove(nums[r]);
	        }

	        if(el.isEmpty()) {
	            if(r-l+1 < smallest.size()) {
	                smallest = new ArrayList<>(list);
	            }

	            list = new ArrayList<>();
	            el = new HashSet<>(elements);
	            l++;
	            r = l;
	        } else {
	            if(r < nums.length-1) r++;
	            else {
	                list.remove(0);
	                l++;
	            }
	        }
	    }

	    return smallest;
	}

}

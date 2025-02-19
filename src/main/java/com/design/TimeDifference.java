package com.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class TimeDifference {
	
	private static FunctionTime<Long,String, String> getFuncitonTime(String time,String func, String label) {
		return new FunctionTime<>(Long.parseLong(time),func,label);
	}

	public static void main(String[] args) {
		
		List<FunctionTime<Long,String, String>> funList = new ArrayList<>();
		funList.add(getFuncitonTime("1652334332","Func1","START"));
		funList.add(getFuncitonTime("1652334333","Func1","START"));
		funList.add(getFuncitonTime("1652334335","Func1","END"));
		funList.add(getFuncitonTime("1652334337","Func1","END"));
		funList.add(getFuncitonTime("1652334338","Func2","START"));
		funList.add(getFuncitonTime("1652334340","Func2","END"));
		usingPartitionMap(funList);
		usingStack(funList);
		
	}

	private static void usingPartitionMap(List<FunctionTime<Long, String, String>> funList) {
		Map<Boolean,List<FunctionTime<Long,String, String>>> segLit = funList.stream().
				collect(Collectors.partitioningBy(fun -> "START".equalsIgnoreCase(fun.label())));
		List<FunctionTime<Long,String, String>> startLabelList = segLit.get(true);
		List<FunctionTime<Long,String, String>> endLabelList = segLit.get(false);
		for(int i=0;i<startLabelList.size();i++) {
			FunctionTime<Long,String, String> srtLabel = startLabelList.get(i);
			FunctionTime<Long,String, String> endLabel = endLabelList.get(i);
			long dif = endLabel.timestamap() - srtLabel.timestamap();
			System.out.println(String.format("%s:%s", srtLabel.name(),dif));
		}
	}
	
	private static void usingStack(List<FunctionTime<Long, String, String>> funList) {
		Stack<FunctionTime<Long, String, String>> stack = new Stack<>();
		for(FunctionTime<Long, String, String> fun : funList ) {
			if("START".equals(fun.label())) {
				stack.add(fun);
			}else {
				FunctionTime<Long, String, String> stackun = stack.pop();
				if(stackun.name().equals(fun.name())) {
					long dif = fun.timestamap() - stackun.timestamap();
					System.out.println(String.format("%s:%s", fun.name(),dif));
				}
			}
		}
	}
	
	 

}

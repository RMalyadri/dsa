package com.dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CrushNumbersUsingQueueStack {

	public static void main(String[] args) {
		int[] cn = {1,1,1,2,2,2,3,3,4,2,2,1};
		stackQueue(cn);	
	//	printNonConsecutiveElements(cn);
	}

	private static void stackQueue(int[] cn) {
		int i=1;
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		queue.add(cn[0]);
		stack.push(cn[0]);
		while(i<cn.length) {
			if(!queue.contains(cn[i])){
				queue.poll();
				queue.add(cn[i]);
				stack.push(cn[i]);			
			}else {
				if(!stack.isEmpty() && stack.peek() == cn[i]) {
					stack.pop();					
				}
				
			}
			i++;
		}
		System.out.println(stack);
	}
	
	private static void printNonConsecutiveElements(int[] intArray) {
		int start1 =0, start2=1;
		int end=intArray.length-1;
		boolean isRepeated = false;
		String result = "";
		while(start2 <= end) {
			int temp = intArray[start1];
			if(temp != intArray[start2]) {
				if(isRepeated) {
					intArray[start1] =0;
					isRepeated=false;
				}else {
					result += intArray[start1];
				}
				start1 = start2;
				start2++;
			}else if(temp == intArray[start2]) {
				isRepeated = true;
				intArray[start2] =0;
				start2++;
			}
		}
		
		if(start1<=end && intArray[end] !=0) {
			result += intArray[end];
		}
		
		System.out.println(result);
	}

}



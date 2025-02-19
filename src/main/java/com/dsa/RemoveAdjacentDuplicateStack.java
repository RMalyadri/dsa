package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveAdjacentDuplicateStack {
	
	private static Logger logger = 
			System.getLogger(RemoveAdjacentDuplicateStack.class.getName());

	public static void main(String[] args) {
		String s="AbcCbd".toLowerCase();
	    Stack<Character> sc = new Stack<>();
	    Queue<Character> queue = new LinkedList<>();
	    int i = 0;
	    while(i < s.length()) {
	    	if(!queue.contains(s.charAt(i))) {
	    		queue.add(s.charAt(i));
	    		sc.push(s.charAt(i));
	    	}else  {
	    		if(sc.size() > 1 && sc.peek() == s.charAt(i)) {
	    			sc.pop();
	    		}
	    	}
	    	i++;
	    }
	    logger.log(Level.INFO, sc);
	    
		
		
	}
		
}



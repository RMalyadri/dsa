package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class General {
	void om(int c) {
		System.out.println("inter");
	}
	
    private static int a;
	General() {
		a = 0;
	}
    static {
    	a = 54;
    }
    {
    	a = 67;
    }
    
    public void m1() {
    	//System.out.println(a+b);
    }
	
	public static void main(String[] args) {
		General g = new General();
		g.om(new Integer(2));

	}

}

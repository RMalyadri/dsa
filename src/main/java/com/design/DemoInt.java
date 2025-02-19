package com.design;

@FunctionalInterface
public interface DemoInt {

	void method();
	default void method2() {
		
	}
	
}

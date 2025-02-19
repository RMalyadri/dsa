package com.dpattern;

public class Singleton {

	private static Singleton singleton;
	private Singleton() throws IllegalAccessException {
		if(singleton != null) {
			throw new IllegalAccessException("object is availabe already");
		}
	}
	public static Singleton getInstance() throws IllegalAccessException {
		if(singleton == null) {
			synchronized(Singleton.class) {
				if(singleton == null) {
					return new Singleton();
				}
			}
		}
		return singleton;
	}
}

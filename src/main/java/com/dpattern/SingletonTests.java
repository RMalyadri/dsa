package com.dpattern;

import java.util.concurrent.CompletableFuture;

public class SingletonTests {

	public static void main(String[] args) throws Exception {
		// checkBothRefSame();
		checkSingletonWithThread();
	}

	private static void checkBothRefSame() throws IllegalAccessException {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 != singleton2) {
			System.out.println("not singleton");
		} else {
			System.out.println("singleton");
		}
	}

	private static void checkSingletonWithThread()
			throws Exception {
		CompletableFuture<Singleton> cf1 = CompletableFuture.supplyAsync(() -> {
			try {
				return Singleton.getInstance();
			} catch (IllegalAccessException e) {
				return null;
			}
		});
		CompletableFuture<Singleton> cf2 = CompletableFuture.supplyAsync(() -> {
			try {
				return Singleton.getInstance();
			} catch (IllegalAccessException e) {
				return null;
			}
		});
		
		if (cf1.get() != cf2.get()) {
			System.out.println("not singleton for multiple threads");
		} else {
			System.out.println("singleton");
		}
	}
	
}

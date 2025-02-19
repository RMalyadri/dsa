package com.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
	public static void main(String[] args) {
		//System.out replace with logger
		CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName()));
		CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName()));
	}

}

package com.thread;

public class ThreadDemoNew {

	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("name"+Thread.currentThread().getName()) );
		t.start();
	}

}

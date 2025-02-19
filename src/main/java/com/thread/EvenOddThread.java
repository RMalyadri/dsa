package com.thread;

public class EvenOddThread {
	public static void main(String[] args) {
		PrintEvenOdd printEvenOdd = new PrintEvenOdd();
		Thread evenThread = new Thread(printEvenOdd::evenPrt);
		Thread oddThread = new Thread(printEvenOdd::syncrnoddPrt);
		evenThread.start();
		oddThread.start();
	}
}

class PrintEvenOdd {
	int i = 1;

	public void evenPrt() {
		while (i <= 10) {
			synchronized (this) {
				if (i % 2 == 0) {
					System.out.println("even -> " + i);
					i++;
					notifyAll();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}

	public void syncrnoddPrt() {
		while (i <= 10) {
			synchronized (this) {
				if (i % 2 == 1) {
					System.out.println("add -> " + i);
					i++;
					notifyAll();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}
}

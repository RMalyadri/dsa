package com.thread;

import java.util.LinkedList;

public class ConsumerProducerBuffer {
	private final int BUFFER_SIZE = 4;
	private LinkedList<Integer> buffer = new LinkedList<>();
	int i = 0;
	public void consumer() throws InterruptedException{
		while(true) {
			synchronized(this) {
				if(buffer.isEmpty()) {
					wait();
				}else {
					System.out.println("consumer -> "+buffer.removeFirst());
					notifyAll();
				}
				Thread.sleep(1000);
			}
			
		}
	}
	
	public void producer() throws InterruptedException{
		while(true) {
			synchronized(this) {
				if(BUFFER_SIZE == buffer.size()) {
					wait();
				}else {
					i = i+1;
					buffer.add(i);
					System.out.println("produceer -> "+i);
					notifyAll();
				}
				Thread.sleep(1000);
			}
		}
	}
	
	public static void main(String[] args) {
		ConsumerProducerBuffer consumerProducerBuffer = new ConsumerProducerBuffer();
		new Thread(() -> {
			try {
				consumerProducerBuffer.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				consumerProducerBuffer.producer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
	}

}

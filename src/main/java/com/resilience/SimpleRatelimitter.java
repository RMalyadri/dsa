package com.resilience;

public class SimpleRatelimitter {
	
	static final int MAX_REQ_PERMITS = 10;
	private static final int WINDOW_PERIOD  = 1000;
	private int tokenSize;
	private long nextRefillTime;
		
	public boolean tryConsume() {
		refill();
		if(tokenSize > 0) {
			tokenSize--;
			return true;
		}
		return false;
	}
	
	private void refill() {
		long currentMillTime = System.currentTimeMillis();
		if(currentMillTime > nextRefillTime) {
			nextRefillTime = currentMillTime+WINDOW_PERIOD;	
			tokenSize = Math.min(MAX_REQ_PERMITS, tokenSize+MAX_REQ_PERMITS);
		}
	}

}

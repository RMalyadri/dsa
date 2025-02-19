package com.resilience;

public class RateLimitterBucketToken {

	public static void main(String[] args) {
		SimpleRatelimitter simpleRatelimitter = new SimpleRatelimitter();
		//long startTime = System.currentTimeMillis();
		int reqCount = 0;
		int i= 1;
		while(i <= 20) {
			System.out.println(i+"is submited");
			if(simpleRatelimitter.tryConsume()) {
				reqCount++;
			}
			i++;
		}
		System.out.print("accepted"+reqCount);

	}

}
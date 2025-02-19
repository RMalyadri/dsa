package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionHadler {

	public static void main(String[] args) {
		
		List<Transaction> list = new ArrayList<>();
		list.add(new Transaction("D1",200));
		list.add(new Transaction("D1",300));
		list.add(new Transaction("D1",500));
		list.add(new Transaction("D2",400));
		list.add(new Transaction("D2",100));
		list.add(new Transaction("D2",150));
		
		
		list.stream()
		.map(tran -> {
			double amt = tran.amout()+tran.amout()*0.1;
			if(tran.amout() < 200) {
				amt = tran.amout()+50;
			}
			return new Transaction(tran.did(),amt);
		}).filter(trn -> trn.amout() > 250)
		.collect(Collectors.groupingBy(Transaction::did, Collectors.counting()))
		.forEach((k,v) -> System.out.println(k+":"+v));

	}

}

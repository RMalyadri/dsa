package com.dsa;

import java.util.Arrays;
import java.util.List;

public class RoundRobin {	
	private Integer position = 0;
	private static List<String> addressList = Arrays.asList("dns1","dns2","dn2");

	public static void main(String[] args) {
		RoundRobin roundRobin = new RoundRobin();
		System.out.println(roundRobin.getServer());
	}
	
	
	private String getServer() {
		String adress = "";
		synchronized(this) {
			if(position  > addressList.size()-1) {
				position = 0;
			}		
			adress = addressList.get(position);
			position++;
		}
		
		return adress;
	}

}

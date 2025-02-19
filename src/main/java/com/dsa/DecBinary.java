package com.dsa;

public class DecBinary {

	public static void main(String[] args) {
		int dec = 5;
		StringBuilder sb = new StringBuilder();
		while(dec != 0) {
			int rem = dec%2;
			dec = dec/2;
			sb.append(rem);
		}
		System.out.println(sb);

	}

}

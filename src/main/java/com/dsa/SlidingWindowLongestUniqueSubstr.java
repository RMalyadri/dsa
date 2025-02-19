package com.dsa;

public class SlidingWindowLongestUniqueSubstr {

	public static void main(String[] args) {
		boolean[] visited = new boolean[256];
		int l=0;
		int r=0;
		int maxLenght=0;
		String st = "interview";
		while(r < st.length()) {
			while(visited[st.charAt(r)]) {	
				visited[st.charAt(l)]=false;	
			    l++;
			}
			visited[st.charAt(r)]=true;
			maxLenght = Math.max(maxLenght,r-l+1);
			r++;
		}
		System.out.println(st.substring(0, maxLenght));

	}

}

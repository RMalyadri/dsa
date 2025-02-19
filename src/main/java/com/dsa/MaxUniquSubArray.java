package com.dsa;

public class MaxUniquSubArray {

	public static void main(String[] args) {
		String word = "intint";
		boolean[] visited = new boolean[256];
		int left = 0;
		int right = 0;
		int maxLenght = 0;
		while(right < word.length()) {
			while(visited[word.charAt(right)]) {
				visited[word.charAt(left)]=false;
				left++;
			}
			visited[word.charAt(right)] = true;
			maxLenght = Math.max(maxLenght, (right-left+1));
			right++;
		}
		System.out.println(word.substring(0,maxLenght));
	}
	


}

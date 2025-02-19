package com.dsa;

public class PascalTraiangle {

	public static void main(String[] args) {
		int row = 4;
		buildTriangle(row);
		getPascalTriangleRow(row);
        
	}

	private static void getPascalTriangleRow(int n) {
		int prev = 1;
		System.out.print(prev);
		for(int i=1;i<=n;i++) {
			int curr = (prev * (n - i + 1)) / i;
		    System.out.print("," + curr);
		    prev = curr;
		}
	}
	
	private static void buildTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int j=0;j<=n-row;j++) {
				System.out.print(" ");
			}
			int c=1;
			for(int r=1;r<=row;r++) {
				System.out.print(c+" ");
				c = c*(row-r)/r;
			}
			System.out.println();
		}
	}

}

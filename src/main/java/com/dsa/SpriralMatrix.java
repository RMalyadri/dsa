package com.dsa;

public class SpriralMatrix {

	public static void main(String[] args) {
		int row=3;
		int col=3;
		int[][] matrix = {{1,2,4},{5,6,7},{8,9,10}};
		print(row, col, matrix);
	}
	
	private static void print(int row, int col, int[][] matrix) {
		int left = 0;
		int right = col-1;
		int top = 0;
		int bottom = row-1;
		while(left <= right && top <= bottom) {
			//top row left to right
			for(int i=left;i<=right;i++) {
				System.out.print(matrix[top][i]+" ");
			}
			top++;
			//top to bottom
			for(int i=top;i<=bottom;i++) {
				System.out.print(matrix[i][right]+" ");
			}
			right--;
			//right left
			if(top <= bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(matrix[bottom][i]+" ");
				}
				bottom--;
			}

			//bottom to top
			if(left <= right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(matrix[i][left]+" ");
				}
				left++;
			}
			
		}
		System.out.println();
	}

}

package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class MedianTwoShortedArrays {
	private static Logger logger = System.getLogger(MedianTwoShortedArrays.class.getName());

	public static void main(String[] args) {
		int[] a = {1,5,6,10};
		int[] b = {4,7,11,22};
		double m = getMedian(a,a.length,b,b.length);
		logger.log(Level.INFO, m);
		

	}
	public static double getMedian(int[] a,int al, int[] b, int bl) {
		int rl = al+bl;
		int[] ma = new int[rl];
		int i=0;
		int j=0;
		int k=0;
		while(i < al && j < bl) {
			if(a[i] < b[j]) {
				ma[k++] = a[i++];
			}else {
				ma[k++] = b[j++];
			}
		}
		while(i < al) {
			ma[k++] = a[i++];
		}
		while(j < bl) {
			ma[k++] = b[j++];
		}
	    int m1 = rl/2;
		if(rl%2 == 1) {
		   return ma[m1];
		}else {
			return (ma[m1]+(double)ma[m1-1])/2;
		}		
	}

}

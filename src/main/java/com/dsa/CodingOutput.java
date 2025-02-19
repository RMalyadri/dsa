package com.dsa;
import java.util.*;
public class CodingOutput{        
    public static void main(String[] val){             
        int[] input={0,1,2,4,5,7}; //output : ["0->2","4->5","7"]
        //int[] input={0,2,3,4,6,8,9};
        int l=0;        
        //0,2
        //int[] input={0,2};
        List<String> output = new ArrayList<>(); 
        while(l < input.length) {
            int start = input[l]; //0 
            int end = input[l]; //0 2
            while(l < input.length-1 && input[l+1]-input[l] == 1) {
                l=l+1;
                end = input[l];                
            }
            if(start == end) {
                output.add(String.valueOf(start));
            }else {
                output.add(String.format("%s->%s",start,end));
            } 
            l++;                        
         }        
        System.out.println(output);                
     }     
}

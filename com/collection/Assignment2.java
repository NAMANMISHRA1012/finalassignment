package com.collection;

import java.util.ArrayList;
import java.util.Arrays;





public class Assignment2 {
	public static void main(String[] args) {
		
	
	int [] a = {2,5,7,9,6};
	
	
	
	
	reverse(a,a.length);
	
	}
	
	
	 public static void reverse(int a[], int n)
	    {
	        int[] x = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	            x[j - 1] = a[i];
	            j = j - 1;
	        }
	        System.out.println("Reversed array is: \n");
	        for (int c = 0; c< n; c++) {
	            System.out.println(x[c]);
	        }
	        int [] l = new int [n];
	    	for(int i =0;i<x.length;i++) {
	    		l[i]= x[i];
	    }
	    	Arrays.sort(l);
	    	for (int i=0;i<n;i++)
	    	System.out.println(l);
		
		
	
	
	
	
	
	
	
	
	    }}



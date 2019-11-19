package bubbleSort;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
	
	
	/*
	 * 		for (int i = 0; i < n; i++) {
		    // Track number of elements swapped during a single array traversal
		    	int numberOfSwaps = 0;
		    
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		            swap(a[j], a[j + 1]);
		            numberOfSwaps++;
		        }
		    }
		    
		    	// If no elements were swapped during a traversal, array is sorted
		    	if (numberOfSwaps == 0) {
		        	break;
		    	}
			}
	 * 
	 * 
	 * 
	 */

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            
            for (int j = 0; j < n - 1; j++) {
            	int smaller = 0;
                if (a[j] > a[j + 1]) {
                  	smaller =a[j + 1] ;
                  	a[j + 1] = a[j];
                  	a[j] = smaller;
                    numberOfSwaps++; System.out.println(Arrays.toString(a));
                }
            }

            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
     System.out.println(numberOfSwaps);
        
//        int smaller = 0;
//        if(a[0] > a[1]) {
//        	smaller = a[1];
//        	a[1] = a[0];
//        	a[0] = smaller;
//        	5 1 4 2 8
//        }
     
     
     
    }
    
    
    public static void swap(int n, int n2) {
    	
      int smaller = 0;
      if(n > n2) {
      	smaller = n2;
      	n2 = n;
      	n = smaller;
      	
      }
    	
    	
    }

}

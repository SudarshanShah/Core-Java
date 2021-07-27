package com.java.basics;

public class Multi_D_Array {

	public static void main(String[] args) {
		
		// create a 2d array
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        
        
        System.out.println("------------------------------------------");
        
        // Traverse 2-D array using for-loop
        
        int[][] a1 = {
                {1, -2, 3}, 
                {-4, -5, 6, 9}, 
                {7}, 
            };
          
            for (int i = 0; i < a1.length; ++i) {
                for(int j = 0; j < a1[i].length; ++j) {
                    System.out.println(a1[i][j]);
                }
            }
            
            
            System.out.println("------------------------------------------");
            
            // Traverse 2-D array using for-each loop
            
            // create a 2d array
            int[][] a3 = {
                {1, -2, 3}, 
                {-4, -5, 6, 9}, 
                {7}, 
            };
          
            // first for...each loop access the individual array
            // inside the 2d array
            for (int[] innerArray: a3) {
                // second for...each loop access each element inside the row
                for(int data: innerArray) {
                    System.out.println(data);
                }
            }
            
            
            System.out.println("------------------------------------------");
            
            // example of 3-D array and its Traversal
            
            // create a 3d array
            int[][][] test = {
                {
                  {1, -2, 3}, 
                  {2, 3, 4}
                }, 
                { 
                  {-4, -5, 6, 9}, 
                  {1}, 
                  {2, 3}
                } 
            };

            // for..each loop to iterate through elements of 3d array
            for (int[][] array2D: test) {
                for (int[] array1D: array2D) {
                    for(int item: array1D) {
                        System.out.println(item);
                    }
                }
            }
	}
}

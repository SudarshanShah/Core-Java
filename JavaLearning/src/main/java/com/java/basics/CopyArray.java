package com.java.basics;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		// Shallow copying -> If element of original array changes element of other array 
		// also changes, because both arrays refer to same array object.
		
		int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
        
        
        System.out.println("-------------------------------------------");
        
        // Deep copying -> Elements of copied array doesn't change even if we change the 
        // element of original array, because both arrays refer to two different array objects.
        
        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
      
         // converting array to string
        System.out.println(Arrays.toString(destination));
        
        
        System.out.println("-------------------------------------------");
        
        // Coping array using arraycopy() method of java.utils.Arrays class.
        // arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
        /*
          src - source array you want to copy
   		  srcPos - starting position (index) in the source array
		  dest - destination array where elements will be copied from the source
		  destPos - starting position (index) in the destination array
		  length - number of elements to copy 
        */
        
        int[] n1 = {2, 3, 12, 4, 12, -2};
        
        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
      
        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));  
      
        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));
        
        
        System.out.println("-------------------------------------------");
        
        // Coping array using copyofRange() method of java.utils.Arrays class.
        
        int[] source1 = {2, 3, 12, 4, 12, -2};
        
        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source1, 0, source1.length);      
        System.out.println("destination1 = " + Arrays.toString(destination1)); 
      
        // copying from index 2 to 5 (5 is not included) 
        int[] destination2 = Arrays.copyOfRange(source1, 2, 5); 
        System.out.println("destination2 = " + Arrays.toString(destination2));
        
        
        System.out.println("-------------------------------------------");
        
        // Deep copying 2-D array
        
        int[][] source2 = {
                {1, 2, 3, 4}, 
                {5, 6},
                {0, 2, 42, -4, 5}
                };

          int[][] destination3 = new int[source2.length][];

          for (int i = 0; i < destination3.length; ++i) {

              // allocating space for each row of destination array
              destination3[i] = new int[source2[i].length];

              for (int j = 0; j < destination3[i].length; ++j) {
                  destination3[i][j] = source2[i][j];
              }
          }
       
          // displaying destination array
          System.out.println(Arrays.toString(destination));
          
          
          System.out.println("-------------------------------------------");
          
          // Coping array using arraycopy() method of java.utils.Arrays class.
          // arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
          /*
            src - source array you want to copy
     		  srcPos - starting position (index) in the source array
  		  dest - destination array where elements will be copied from the source
  		  destPos - starting position (index) in the destination array
  		  length - number of elements to copy 
          */
          
          int[][] source3 = {
                  {1, 2, 3, 4}, 
                  {5, 6},
                  {0, 2, 42, -4, 5}
                  };

            int[][] destination4 = new int[source3.length][];

            for (int i = 0; i < source3.length; ++i) {

                 // allocating space for each row of destination array
                 destination4[i] = new int[source3[i].length];
                 System.arraycopy(source3[i], 0, destination4[i], 0, destination4[i].length);
            }
         
            // displaying destination array
            System.out.println(Arrays.toString(destination));
	}
}

package com.java.cp.beginner;

import java.util.Scanner;

// Problem Code: TALAZY
public class Codechef1
{
    public static long calculateProblemCount(long problemCount) {
        if(checkProblemCount(problemCount))
            return problemCount/2;
        else return (problemCount+1)/2;
    }
    
    private static boolean checkProblemCount(long problemCount) {
        return (problemCount%2)==0;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
			int test;
	        if(sc.hasNextInt())
	            test=sc.nextInt();
	        else test = 0;     
		
		for (int i=0; i<test; i++){
		    long problemCount = sc.nextLong();
	    	long breakTime = sc.nextLong();
	    	long workingTime = sc.nextLong();
		
		    long getProblemCount = Codechef1.calculateProblemCount(problemCount);
		
		    long time = 0;
	    	boolean flag = true;
	    	int counter = 0;
		    
		    do {
		    if(counter==0) {
		    	time = time + (getProblemCount * workingTime) + breakTime;
		    }
		    
		    if(counter >= 1)
		    {
    		    problemCount = problemCount - getProblemCount;
    		    if(problemCount==0) {
     	           break;
     	       }
                getProblemCount = Codechef1.calculateProblemCount(problemCount);
                workingTime = 2 * workingTime;
    		    time = time + (getProblemCount * workingTime) + breakTime;
    		    }    
		    
    		counter++;
		}while(flag);
		System.out.println(time-breakTime);
		} 
		sc.close();
	}
	
}

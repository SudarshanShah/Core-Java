package com.java.cp.beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Problem Code: FLOW017
public class Codechef22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			
			List<Long> list = new ArrayList<Long>();
			
			list.add(a);
			list.add(b);
			list.add(c);
			
			Collections.sort(list);
			
			System.out.println(list.get(1));
		}
		
		scanner.close();
	}
}

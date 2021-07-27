package com.java.cp.beginner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Problem Code: C00K0FF
public class Codechef5 {

	private static final Set<String> SET = new HashSet<String>();
	
	private static final List<String> LIST = Arrays.asList("cakewalk", "simple", "easy"); 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test;
		
		if (scanner.hasNext()) {
			test = scanner.nextInt();
		}
		else test = 0;
		
		while (test-- > 0) {
			
			long problems = scanner.nextLong();
			
			scanner.nextLine();
			
			while (problems-- > 0) {
				String string = scanner.next();
				SET.add(string);
			}
			
			if (SET.containsAll(LIST) && (SET.contains("easy-medium") | SET.contains("medium")) 
									  && (SET.contains("medium-hard") | SET.contains("hard")) ) {
				System.out.println("Yes");
				SET.clear();
			}
			
			else {
				System.out.println("No");
				SET.clear();
			}
		}
		
		
		scanner.close();
	}
}

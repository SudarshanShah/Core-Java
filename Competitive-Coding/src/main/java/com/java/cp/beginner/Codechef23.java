package com.java.cp.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Problem Code: FLOW010
public class Codechef23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			Map<Character, String> map = new HashMap<Character, String>();
			
			map.put('B', "BattleShip");
			map.put('b', "BattleShip");
			map.put('C', "Cruiser");
			map.put('c', "Cruiser");
			map.put('D', "Destroyer");
			map.put('d', "Destroyer");
			map.put('F', "Frigate");
			map.put('f', "Frigate");
			
			
			char c = scanner.next().charAt(0);
			
			System.out.println(map.get(c));
		}
		
		scanner.close();
	}
}

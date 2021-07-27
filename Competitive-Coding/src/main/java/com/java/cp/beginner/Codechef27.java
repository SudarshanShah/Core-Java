package com.java.cp.beginner;

import java.util.*;

// Problem Code: RECTSQ
public class Codechef27 {
	
	private static HashMap<Long, Long> map = new HashMap<Long, Long>();
	
	public static HashMap<Long, Long> minSquares(long i, long plotArea) {
		long sqArea = i * i;
		long sqCount = plotArea / sqArea;
		
		if (sqArea <= plotArea) {
			map.put(sqArea, sqCount);
		}
		
		return map;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test;
		
		if(scanner.hasNext())
		    test = scanner.nextInt();
		else test = 0;
		
		
		while(test-- > 0) {
			
			long length = scanner.nextLong();
			long breadth = scanner.nextLong();
			
			long area = length * breadth;
			
			long sqRoot = (long) Math.sqrt(area);
			
			for(int i=1; i<=sqRoot; i++) {
				long j = i;	
				minSquares(j, area);
			}
			
			List<Long> largestArea = new ArrayList<Long>();
			
			long getLargestArea = 0;
			
			System.out.println(map);

			for(Map.Entry<Long, Long> map : map.entrySet()) {
				long product = map.getKey()*map.getValue();
				if (product >= getLargestArea) {
					if (largestArea.isEmpty()) {
						largestArea.add(product);
					}
					else {
						largestArea.removeAll(largestArea);
						largestArea.add(product);
					}
					getLargestArea = product;
				}
			}
			
			System.out.println("Get Largest Area : " + largestArea);
			
			long minValue = Integer.MAX_VALUE;
			
			for(Map.Entry<Long, Long> map: map.entrySet()) {
				long product = map.getKey()*map.getValue();
				if (product==largestArea.get(0)) {
					if (minValue > map.getValue()) {
						minValue = map.getValue();
					}
				}
			}
			System.out.println(minValue);
		}
		
		scanner.close();
	}
}

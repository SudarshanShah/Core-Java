package com.java.calender;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
				
		calendar.clear();
		calendar.set(2021, 2, 28);
		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		 if (calendar.get(Calendar.DAY_OF_WEEK)==1) {
			System.out.println("Its Sunday...Horay");
		}
		 else {
			 System.out.println(calendar.getTime());
		}
		
		System.out.println("Date is : " + day + "/" + (month+1) + "/" + year);
		
		System.out.println("Time is : " + hour + "/" + minute + "/" + second);
		
	    System.out.println("Date get is : " + calendar.get(Calendar.YEAR));
		
	}
}

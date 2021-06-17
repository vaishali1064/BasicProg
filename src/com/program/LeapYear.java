package com.program;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter 4 digit Number");
		int Year = Utility.getUserSpecificInteger();
		
		if (Year >= 1000 && Year <= 9999)
		{	
			if (Year%400==0 || Year%4==0 && Year%100!=0)
			{
				System.out.println(+Year + " year is leap year");
			}
			else
			{
				System.out.println(+Year + " year is not a leap year");
			}
		}
	}

}

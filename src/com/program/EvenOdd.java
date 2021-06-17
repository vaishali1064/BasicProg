package com.program;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		int Number = Utility.getUserSpecificInteger();
		
		if ( Number % 2 == 0)
		{
			System.out.println("number is even");
		
		}
		else
		{
			System.out.println("number is odd");
		}

	}

}

package com.program;

public class QuotientRemainder {

	public static void main(String[] args) {
		
		System.out.println("Enter Dividend");
		int Dividend = Utility.getUserSpecificInteger();
		System.out.println("Enter Divisor");
		int Divisor = Utility.getUserSpecificInteger();
		
		int Quotient = Dividend/Divisor;
		System.out.println("Quotient : " +Quotient);
		
		int Remainder = Dividend%Divisor;
		System.out.println("Remainder : " +Remainder);

	}

}

package com.program;

public class SwapNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter First Number");
		int Num1 = Utility.getUserSpecificInteger();
		System.out.println("Enter Second Number");
		int Num2 = Utility.getUserSpecificInteger();
		
		int temp;
		
		System.out.println("before swapping :" + Num1 + " " + Num2 );
		

		temp=Num1;
		Num1=Num2;
		Num2=temp;
		System.out.println(" after swapping :" + Num1 + " " + Num2 );

	}

}

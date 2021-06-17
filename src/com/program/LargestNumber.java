package com.program;

public class LargestNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter First Number");
		int num1 = Utility.getUserSpecificInteger();
		System.out.println("Enter Second Number");
		int num2 = Utility.getUserSpecificInteger();
		System.out.println("Enter Third Number");
		int num3 = Utility.getUserSpecificInteger();
		
		if(num1 > num2 && num1 > num3)
        {
            System.out.println("Largest number is :"+num1);
        }
        else if(num2 > num3)
        {
            System.out.println("Largest number is :"+num2);
        }
        else
        {
            System.out.println("Largest number is :"+num3);
        }

	}

}

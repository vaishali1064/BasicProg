package com.program;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		int Num = Utility.getUserSpecificInteger();
		
		int Power=0;
		while(Power <= Num)
		{
			
			int PowOfTwo = (int) Math.pow(2, Power);
			
			if(PowOfTwo >= 0 && PowOfTwo <= Num)
			{
			System.out.println("2^"+Power+ " is " +PowOfTwo);
			}
			
				Power++;
			
		}

	}

}

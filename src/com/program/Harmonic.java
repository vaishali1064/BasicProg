package com.program;

public class Harmonic {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		int Num = Utility.getUserSpecificInteger();
		
		double result = 0.0;
        while(Num > 0)
          {
               result = result + (double) 1 / Num;
               Num--;
               System.out.print(result +"  ");
          }
	        System.out.println("");
	        System.out.println("Output of Harmonic Series is "+result);
	}

}

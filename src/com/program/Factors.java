package com.program;

public class Factors {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		int Number = Utility.getUserSpecificInteger();
		
		while(Number%2 == 0)
		{
			System.out.println(2+ " ");
			Number = Number/2;
		}
		 for (int i = 3; i <= Math.sqrt(Number); i= i + 2)
	      {
	           while (Number%i == 0)
	           {
	                System.out.print(i + " ");
	                Number = Number / i;
	            }
	       }
				if (Number > 2) 
				{
				System.out.println(Number);
				}

	}

}

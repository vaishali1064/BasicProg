package com.program;

public class FlipCoin {

	public static void main(String[] args) {
		
		int Head=0, Tail=0, Head_Per=0, Tail_Per=0;
		
		System.out.println("Enter no of Flip");
		int flip = Utility.getUserSpecificInteger();
		
		for(int i = 0; i<flip; i++)
		{
			double randomValue = Utility.getRandomDouble();
			System.out.println(+randomValue);
			
			if(randomValue > 0.5)
			{
				Head++;
				
			}
			else
			{
				Tail++;
			}
			 
		}
			Head_Per = (Head*100) /flip  ;
			Tail_Per = (Tail*100) / flip ;
			System.out.println("Percentage of heads: " + Head_Per + "%");
			System.out.println("Percentage of tails: " + Tail_Per + "%");
	}

}

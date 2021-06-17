package com.program;

public class TwoDArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of m and n");
		int m = Utility.getUserSpecificInteger();
		int n = Utility.getUserSpecificInteger();
		
		int[][] a = new int[m][n];
		
		m = a.length; // no of rows
		n = a[0].length; //the number of columns on row 0
		
		System.out.println(m + " " + n);
		
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				System.out.printf("%9d ", a[i][j]);
			}
			System.out.println();
		}
	}

}

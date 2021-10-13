package com.example.demo;

public class MoveZeros {
	public static void main (String args[])
	{
		int index=0;
		int arrZeros[]= {0,1,0,3,1,2};
		for(int i=0;i<arrZeros.length;i++)
		{
			if(arrZeros[i]!=0)
				{
					arrZeros[index]=arrZeros[i];
					index++;
				}
						
		}
		while(index<arrZeros.length)
		{
			arrZeros[index]=0;
			index++;
		}
		
		//Printing final array
		for(int i=0;i<arrZeros.length;i++)
			System.out.println(arrZeros[i]);
		
	}

}

package com.example.demo;

import java.util.Arrays;

public class FindKCLosestPoints {
	public static void main (String args[])
	{
		int k=2;
		int pointsArr[][]= {{13,3},{3,2},{1,9}};
		findKclosestORigin(pointsArr,k);
	}

	private static void findKclosestORigin(int[][] pointsArr, int k) {
		// TODO Auto-generated method stub
		int i,j;
		int len=pointsArr.length;
		int distance[]=new int[pointsArr.length];
		int tempDist=0;
		
		for(i=0;i<len;i++)
		{
			for(j=0;j<pointsArr[i].length;j++)

			{
				System.out.println("the points are :"+pointsArr[i][j]);
				tempDist=tempDist+(pointsArr[i][j]*pointsArr[i][j]);
			}
			distance[i]=distance[i]+tempDist;
			System.out.println("Distance is: "+distance[i]);
			tempDist=0;
			
		}
		
	/*	for(int i1=0;i1<distance.length;i1++)
			System.out.println(distance[i1]); */ //Printing to check

		Arrays.sort(distance); // Sorted Distance Array
		
	/*	for(int i1=0;i1<distance.length;i1++)
			System.out.println(distance[i1]); */ // Printing to verify
		int distanceFromK=distance[k-1]; //This was difficult, I was wondering how to link distance and points
		
		  for(int i1 = 0; i1 < len; i1++)
		    {
		        int x = pointsArr[i1][0], y = pointsArr[i1][1];
		        int dist = (x * x) + (y * y);
		         
		        if (dist <= distanceFromK)
		        	  System.out.println("[" + x + ", " + y + "]");
		    }
		         

	}

}

package com.bridgelabz;

public class PrimeNumber {
	
	public static void main(String[] args) 
	{
		int minBound=0;
		int maxBound=1000;
		for(int i=minBound+1; i<maxBound; i++)
		{

			int flag = 1;
			for (int j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					flag=0;
					break;
				}
			}
			if(flag ==1)
			{
				System.out.println(i);
			}
		}

	}

}

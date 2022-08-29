package com.bridgelabz;

public class MergeSort {
	
	private void mergeSort(int array[],int lowerBound,int upperBound)
	{
		if(lowerBound<upperBound)
		{
			int mid = (lowerBound+upperBound)/2;
			mergeSort(array,lowerBound,mid);
			mergeSort(array,mid+1,upperBound);
			merge(array,lowerBound,mid,upperBound);
		}
	}

	//Method to merge two sub arrays
	private void merge(int array[], int lowerBound, int mid, int upperBound)
	{
		int n1 = mid - lowerBound + 1;
		int n2 = upperBound - mid;

		//creating temp arrays
		int L[] = new int [n1];
		int R[] = new int [n2];

		//copy data to temp arrays
		for (int i=0; i<n1; ++i)
			L[i] = array[lowerBound + i];
		for (int j=0; j<n2; ++j)
			R[j] = array[mid + 1+ j];

		//Merging two sub arrays
		int i = 0, j = 0;
		int k = lowerBound;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				array[k] = L[i];
				i++;
			}
			else
			{
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1)
		{
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			array[k] = R[j];
			j++;
			k++;
		}
	}
	public void printArray(int array[])
	{
		for(int elements: array)
		{
			System.out.println(elements + " ");
		}
	}

	public static void main(String args[])
	{
		int array[] = {5,28,20,16,27,10,24};
		MergeSort obj = new MergeSort();
		obj.mergeSort(array,0,array.length-1);
		obj.printArray(array);
	}

}

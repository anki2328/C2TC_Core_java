package com;

public class JaggedArrayDemo {

	public static void main(String[] args)
	{
	//declaring 2-D array with2 rows
		int arr[][]=new int[2][];
		//marking the above array Jagged
		//first row has 3 columns
		arr[0]=new int[3];
		//second row has 2 columns
		arr[1]=new int[2];
		//Initializing array
		int count=0;
		for (int i=0;i<arr.length;i++)
		for (int j=0;j<arr[i].length;j++)
			arr[i][j]=count++;
		//Displaying the values of 2D Jagged array
		System.out.println("Contents of 2D Jagged Array");
		for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr[i].length;j++)
        	System.out.println(arr[i][j]+"");
		System.out.println();
			
			
		

	}

}

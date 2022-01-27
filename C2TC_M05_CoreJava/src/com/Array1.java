package com;

public class Array1 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60};
		System.out.println(a[2]+" "+ a[4] );
		
		
		//enhanced for 
		for(int temp : a) {
			System.out.println(temp);
			
		}
	}

}

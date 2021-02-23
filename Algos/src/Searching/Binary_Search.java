package Searching;

import java.util.Scanner;

public class Binary_Search {
	
	// make a method for binary search
	
	static int binarySearch(int arr[], int n, int f)
	{
		int l=0;
		int h=n;
		while(l<h)
		{
		int	mid = (l+h)/2;
		 if(arr[mid]==f)
			 return arr[mid];
		 
		 if(f<arr[mid])
		  h=mid-1;
		 else
			 l=mid+1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arr size:");
		int n = sc.nextInt();
		System.out.println("Enter find no:");
		int f =sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter here sorted array");
		for(int i = 0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		//System.out.println("make new fild");
		
		System.out.println(binarySearch(arr, n, f));

	}

}

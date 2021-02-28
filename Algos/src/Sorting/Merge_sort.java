package Sorting;

import java.util.Scanner;

public class Merge_sort {
		
		int arr[];
		int temparr[];
		int length;
		
		public void sort(int inarr[])
		{
			this.arr =inarr;
			this.length = inarr.length;
			this.temparr = new int[length];
			divideArray(0,length-1);
			
		}
		
		public void divideArray(int low, int high)
		{
			if (low<high)
			{
				int mid = low+(high-low)/2;
				divideArray(low, mid);
				divideArray(mid+1, high);
				mergrArray(low, mid, high);
			}
		}
		
		public void mergrArray(int low, int mid, int high) {
			
			
			for(int i =low; i<=high;i++)
			{
				temparr[i] = arr[i];
			}
			int i= low;
			int j = mid+1;
			int k=low;
			while(i<=mid && j<=high)
			{
				if(temparr[i]<=temparr[j])
				{
					arr[k] = temparr[i];
					i++;	
				}
				else
				{
					arr[k] = temparr[j];
					j++;
				}
				k++;
				
			}
			
			while(i<=mid)
			{
				arr[k] = temparr[i];
				k++;
				i++;
			}
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int inarr[] = new int[n];;
		
		for(int i=0;i<inarr.length;i++)
		{
			inarr[i] = sc.nextInt();
		}
		Merge_sort ms = new Merge_sort();
		
		ms.sort(inarr);
		for(int i:inarr)
		{
			System.out.println(i+" ");
		}
		
		
		
		
		
	}

}

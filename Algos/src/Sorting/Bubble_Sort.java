package Sorting;

public class Bubble_Sort {
	
	// In this sorting take TC is O(n^2);
		
	static void bubble_sort(int arr[] )
	{
		int n = arr.length;
		for(int j = 0 ;j<n-1 ; j++)
		{
		for(int i = 0;i<n-1-j;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i]  = arr[i+1];
				arr[i+1] = temp;
			}
		}
		}
//		for(int i=0;i<n;++i)
//		{
//			System.out.println(arr[i]+ " ");
//		}
		
	}
		
	static void print_arr(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,7,4,1,8,5,6};
		
		
		bubble_sort(arr);
		print_arr(arr);
		
		
		

	}

}

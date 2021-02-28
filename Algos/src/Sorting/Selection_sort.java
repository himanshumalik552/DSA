package Sorting;

public class Selection_sort {
	
	//apply two things are there  searching and sorting;
	
	static void selection_sort(int arr[])
	{
		for(int i = 0 ; i<arr.length;i++)
		{
			int min =i;
			
			//find smallest element of array and switch current index
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[] = {2,4,1,5,3,6};
		
		selection_sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}

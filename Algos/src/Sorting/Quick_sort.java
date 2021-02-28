package Sorting;

public class Quick_sort {
	
		static int partition(int arr[] , int low, int high)
		{
			int pivot = arr[(low+high)/2];
			
			while(low<=high)
			{
				while(arr[low]<pivot)
				{
					low++;
					
				}
				while(arr[high]>pivot)
				{
					high--;
				}
				if(low<=high) {
					int temp = arr[low];
					arr[low] = arr[high];
					arr[high] = temp;
					
					low++;
					high--;  
					}
			}
			
			return low;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

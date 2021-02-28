package Sorting;

public class Insertion_sort {
	
	

		void insertion_sort(int arr[])
		{
			int n = arr.length;
			// the for loop of all array point start with index 1;
			for(int i=1;i<n;i++)
			{
				int temp = arr[i];
				int j = i-1;
				
				// this loop go to sorted array and put a value in correct place;
				while(j>=0 && arr[j]>temp)
				{
					//swap value                                                                                         
					arr[j+1] = arr[j];
					j--;
					
				}
				arr[j+1] = temp;
			}
			
			for(int i = 0 ; i<n;i++)
			{
				System.out.print(arr[i]+ " ");
			}
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,6,2,9,5,7};
		
		
		Insertion_sort ob =new Insertion_sort();
		
		ob.insertion_sort(a);

	}

}

package loveBabbarDSA;

public class Pivot_element_In_Array {

	public static void main(String[] args) {
		
		//int a []= {1,2,3,7,9}; 
		// sorted array
		
		// sorted right shift array 
		int a [] = {3,7,9,1,2};
		
		int start = 0;
		int end = a.length-1;
		int target = 10;
		
		int mid = (start+end)/2;
	
		// finding a pivot index in an Array
		int pivot = pivot(a,start, end, mid);
		System.out.println("Pivot index is : "+pivot);
		
		// searching a Target element in an Array 
		
		if(a[pivot] <= target && target <= a[end]) 
		// if target is lies in between from start -> pivot index to end -> last end index 
		// otherwise Target should be present in between from Start -> 0 index to end -> pivot-1 index   
		{
			int find =searchIn(a ,pivot,end,target);
			
			if(find !=-1)
			System.out.println("Target is present at index : "+find);
			else
			System.out.println("Target is not present in Array");
		}
		else
		{
			int find =searchIn(a ,start ,pivot-1,target);
			
			if(find !=-1)
			System.out.println("Target is present at index : "+find);
			else
			System.out.println("Target is not present in Array");
		}

	}

	private static int pivot(int a[],int start, int end, int mid) {
		
		
		while (start < end)
		{
			//finding a pivot index in an array
			if(a[mid] >a[0])
				start=mid+1;
			else
				end =mid;
			
			mid= (start+end)/2;
		}
		return start;
	}

	private static int searchIn(int a [],int start, int e, int target) {
		
		
		while(start<=e)
		{
			int mid = (start + e)/2;
			
			if(a[mid]==target)
			{
				return mid;
			}
			
			if(a[mid]<target)
			{
				start = mid+1;
			}
			else
			{
				e=mid-1;
			}
		}
		return -1;
		
	}

}

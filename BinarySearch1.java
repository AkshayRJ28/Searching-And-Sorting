package loveBabbarDSA;

public class BinarySearch1 {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,4,4,4,4,4,5};
		
		int key =4;
		
	 System.out.println("First Occurence of "+key+" at index : "+firstOcc(a,key));	
	 System.out.println("Last Occurence of "+key+" at index : "+lastOcc(a,key));
	 
	 // if array is sorted then total of similar elements can be counted as 
	 int total = (lastOcc(a,key)-firstOcc(a,key)) +1;
	 
	 System.out.println("Total element of "+key+" found count is : "+total);
	

	}

	private static int lastOcc(int[] a, int key) {
		
		int start =0;
		int end =a.length-1;
		int ans =-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			
			if(a[mid]==key)
			{
				ans =mid;
				start =mid+1;
			}
			else if(a[mid] > key)
			{
				start =mid+1;
			}
			else
			{
				end =mid-1;
			}
		}
		return ans;
	}

	private static int firstOcc(int[] a, int key) {
		int start = 0;
		int end = a.length-1;
		int ans=-1;
		int mid = (start + end)/2;
		while(start<=end)
		{
			
			if(a[mid]==key)
			{
				ans =mid;
				end =mid-1;
			}
			else if( key >a[mid])
			{
				start=mid+1;
			}
			else
			{
				end= mid-1;
			}
		
			mid = (start + end)/2;
			
		}
		return ans;
		
	}


}

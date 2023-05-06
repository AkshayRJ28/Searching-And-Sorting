package loveBabbarDSA;

public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		
		int a [] = {3,4,5,1};
		
		int s=0;
		int e=a.length-1;
		int ans =0;
		
		while(s<e)  // if = sign we apply then it goes to infinity 
		{
			int mid= (s+e)/2;
			
			if(a[mid]<a[mid+1])
				s=mid+1;
			else
				e=mid;
		}
		//System.out.println("Peak element in array is : "+a[s]);
		
		pivotIndex();

	}
	
	public static void pivotIndex()
	{
		int a[]= {1,7,3,6,5,1};
		
		int total =0;
		int leftSum=0;
		int index =0;
		
		for(int i=0; i<a.length;i++)
		{
			total +=a[i];
		}
		
		for(int i=0; i<a.length;i++)
		{
			int rightSum = total - a[i]-leftSum;
			
			if(rightSum==leftSum)
			{
				index =i;
			}
			
			leftSum += a[i];
		}
		
		System.out.println(leftSum);
	}

}

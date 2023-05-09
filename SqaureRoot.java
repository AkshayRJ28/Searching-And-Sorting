package loveBabbarDSA.Binary_Search;

public class SqaureRoot {

	public static void main(String[] args) {
		
		int number= 37;
		
		int sqrt = sqrt(number);  // it will give integer value of square root of the number
		System.out.println(sqrt);
		
		double ans = morePrecious(number,3,sqrt); // it will give floating square root of number
		System.out.println(ans);
		
	}

	private static double morePrecious(int number, int precious, int sqrt) {
		
		double factor=1;
		double temp =sqrt;
		for(int i=0; i<precious; i++)
		{
			factor=factor/10;
			for(double j=temp; j*j<number; j=j+factor)
			{
				temp=j;
			}
		}
		return temp;
	}

	private static int sqrt(int number) {
		
		int start = 0;
		int end =number;
		int ans=0;
		while(start<=end)
		{
			int mid = (start+end)/2;
			int sq= (mid*mid);
			
			if(mid*mid==number)
			{
				return mid;
			}
			
			if(sq < number)
			{
				ans=mid;
				start = mid+1;
				
			}
			else
			{
				end = mid-1;
			}
		}
	
		return ans;
	}

}

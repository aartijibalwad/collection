package collection.learn.neW.ass;

public class prime {

	public static boolean isPrime(int n) 
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int a[] = {10,5,18,20,7,11,9,2};
		
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.println(a[i]);
			}
		}
		
	}

}

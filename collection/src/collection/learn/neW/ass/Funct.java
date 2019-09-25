package collection.learn.neW.ass;

public class Funct {

	public static int[] contains(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				arr[i]=0;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {14,75,3,98,2,16,20};
		
		arr=contains(arr,16);
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		
	}

}

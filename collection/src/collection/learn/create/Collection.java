package collection.learn.create;

public interface Collection 
{
	void add(int x);
	int size();
	boolean contains(int key);
	int get(int index);
}

class Array implements Collection
{
	int arr[];
	int k=0;
	
	Array(int n)
	{
		arr=new int[n];
	}
	
	public void add(int x)
	{
		arr[k]=x;
		k++;
	}
	
	public int size()
	{
		return k;
	}
	
	public boolean contains(int key)
	{
		for(int i=0;i<k;i++)
		{
			if(arr[i]==key)
			{
				return true;
			}
		}
		return false;
	}
	
	public int get(int index)
	{	
		return arr[index] ;
	}
}



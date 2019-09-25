package collection.learn.neW.ass;
import java.util.*;

public class ListInfo 
{
	
	public static List replace(List arr,int s,int d)
	{
		int i=arr.indexOf(s);
		arr.remove(i);
		arr.add(i,14);
		
		
		return arr;
	}

	public static void main(String[] args)
	{
		List<Integer> arr =new ArrayList<Integer>();
		Stack<Integer> st =new Stack<Integer>();
		
		st.push(10);
		st.push(5);
		st.push(7);
				
		int m=st.pop();
		st.pop();
		
		System.out.println(st);
		
		
		System.out.println(st.peek());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		arr.add(5);
		arr.add(7);
		arr.add(10);
		arr.add(6);
		arr.add(4);
		arr.add(2);
		
		for(int i=11;i<=13;i++)
		{
			arr.add(i);
		}
		
		int x=arr.size();
		
		arr.remove(x-1);
		
		Integer y=6;
		
		arr.remove(y);
		
		
		boolean flag=arr.contains(19);
		
		System.out.println(flag);
		
		System.out.println(arr.size());
		System.out.println(arr);
		
		arr=replace(arr,4,14);
		
		arr.sort(null);
		
		System.out.println(arr);
		
		
		Set<Integer> setting = new HashSet<Integer>();
		setting.add(10);
		setting.add(7);
		setting.add(2);
		setting.add(5);
		
		System.out.println(setting.contains(4));
		
		List<Integer> linklist =new LinkedList<Integer>();
		linklist.add(1);
		linklist.add(2);
		linklist.add(5);
		linklist.add(4);
		linklist.add(7);
		
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println(linklist.get(i));
		}
		
		Iterator<Integer> it=linklist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		System.out.println("//");
		
		System.out.println("hello world\\");
		
		try {
			int a[] = new int[10];
			
			a[10] = 15;
			
			System.out.println(a[10]);
		}
		catch(Exception e)
		{
			
		}
		
		
		int x1=0;
	
		if(x1==0)
		{
			throw new NullPointerException("fail");
		}
		
				
			
		
	}

}

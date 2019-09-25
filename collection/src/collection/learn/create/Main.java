package collection.learn.create;

public class Main {

	public static void main(String[] args) 
	{
		
		Array a1=new Array(10);
		
		a1.add(5);
		a1.add(2);
		a1.add(1);
		a1.add(7);
		
		System.out.println(a1.size());
		
		System.out.println(a1.get(1));
		
		System.out.println(a1.contains(10));
		
		
	}

}

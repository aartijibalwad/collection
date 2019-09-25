package collection.learn.neW.ass;
import java.util.*;

abstract class  bike
{
	abstract void ride();
	abstract void stop();
	
}

class cbz extends bike
{

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("riding");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stopping");
	}
	
}

class dukati extends bike
{

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}


abstract class bird
{
	void fly()
	{
		System.out.println("bird is flying");
	}
	
	abstract void eat();
}

class parrot extends bird
{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}
	
}


class first
{
	static void run()
	{
		System.out.println("i am pravin bhadadaaaaa");
	}
}
class second extends first
{
	static void run()
	{
		System.out.println("i am aarti");
	}
}

public class Main 
{
	public static void function()
	{
		try {
			int a=0/0;
		}
		catch(Exception e)
		{
			System.out.println("fun catched");
		}
		finally
		{
			System.out.println("fun finally");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		second f1=new second();
		f1.run();
		
		bike b = new cbz();
		
		b.ride();
		b.stop();
		
		try {
			function();
		}
		catch(Exception e)
		{
			System.out.println("main catched");
		}
		finally
		{
			System.out.println("main finally");
		}
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		int space=n-1;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.print("\n");
			space=space-1;
			star=star+2;
		}
		// OPPOSITE OF PYRAMID
		
		for(int i=1;i<=n;i++)
		{
			space=space+1;
			star=star-2;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.print("\n");
		}
	}
}

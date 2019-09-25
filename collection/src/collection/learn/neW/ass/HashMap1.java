package collection.learn.neW.ass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashMap1 {

	public static String[] extract(String code)
	{
		String lines[];	
	
		String keyword[] =  new String[1000];
		int k=0;
		
		for(int i=0;i<1000;i++)
		{
			keyword[i]="";
		}
		
		lines = code.split("\n");
		
		for(int j=0;j<lines.length;j++)
		{
			for(int i=0;i<lines[j].length();i++)
			{
				
				if(lines[j].charAt(i)=='<' || lines[j].charAt(i)=='(' || lines[j].charAt(i)=='>' || lines[j].charAt(i)==')' || lines[j].charAt(i)==';' || lines[j].charAt(i)=='{' || lines[j].charAt(i)=='}')
				{
					k++;
				}
				else
				{
					keyword[k]=keyword[k]+lines[j].charAt(i);
				}
				
			}
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.println("("+keyword[i]+")");
		}
			
		return keyword;
	}
	
	
	public static void main(String[] args) 
	{
		HashSet<String> hashc=new HashSet<String>();
		hashc.add("#include");
		hashc.add("printf");
		hashc.add("if");
		hashc.add("scanf");
		hashc.add("else");
		hashc.add("for");
		
		HashSet<String> hashcpp=new HashSet<String>();
		hashcpp.add("#include");
		hashcpp.add("cout");
		hashcpp.add("if");
		hashcpp.add("cin");
		hashcpp.add("else");
		hashcpp.add("for");
		
		String keyword[];
		
		String code="#include<iostream>\n" + 
				"using namespace std;\n" + 
				"\n" + 
				"void main()\n" + 
				"{\n" + 
				"cout<<\"hello\";\n" + 
				"}";
		
		keyword = extract(code);
		
		System.out.println(Arrays.toString(keyword));
		
		
		int count=0;
		int count1=0;
		
		
		for(int i=0;i<keyword.length;i++)
		{
			if(hashc.contains(keyword[i]))
			{
				count++;
			}
			
			if(hashcpp.contains(keyword[i]))
			{
				count1++;
			}
		}
		System.out.println(count+" "+count1);
		
		float formula=(float)count/keyword.length;
		float formula1=(float)count1/keyword.length;
		
		System.out.println(formula+" "+formula1);
		
		if(formula>formula1)
		{
			System.out.println("from c");
		}
		else
		{
			System.out.println("from cpp");
		}
		
		
			
	}

}

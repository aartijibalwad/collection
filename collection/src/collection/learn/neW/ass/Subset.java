package collection.learn.neW.ass;

import java.util.*; 

class Subset
{ 
static Vector<Integer> x= new Vector<Integer>();
static void printAllSubsetsRec(int arr[], int n, Vector<Integer> v,	int sum) 
{ 
	
	if (sum == 0) { 
      	if(v.size()<x.size())
        {
         	x.clear();
          	x.addAll(v);
        }
		
		return; 
	} 

	
	if (n == 0) 
		return; 

	
	printAllSubsetsRec(arr, n - 1, v, sum); 
	Vector<Integer> v1=new Vector<Integer>(v); 
	v1.add(arr[n - 1]); 
	printAllSubsetsRec(arr, n - 1, v1, sum - arr[n - 1]); 
} 

static void printAllSubsets(int arr[], int n, int sum) 
{ 
	Vector<Integer> v= new Vector<Integer>(); 
	printAllSubsetsRec(arr, n, v, sum); 
} 


public static void main(String args[]) 
{ 
	int arr[] = { 10, 0 ,-1, 20, 25, 30 }; 
	int sum = 59; 
	int n = arr.length; 
  
  for(int i=0;i<n;i++)
  {
   	x.add(arr[i]); 
  }
	printAllSubsets(arr, n, sum); 
  
  	System.out.println(x);
	
} 
} 

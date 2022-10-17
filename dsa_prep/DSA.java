import java.util.*;
public class DSA
{
	public static void main(String... args)
	{
//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

/*
		int[] arr = {-2, 1, -4, 5, 3};
		System.out.println("Expect value 1. Actual value is "+findMaxMinSum(A));
*/
		int[] arr = {1,2,3,7,5};
		int n = 5, s = 12 ;
		System.out.println("Expect value 2 4. Actual value is "+subarraySum(arr,n,s));


	}
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
   	 {
		ArrayList<Integer> result = new ArrayList<>();
        	int start=1,end=1;
		int sum=arr[0];
		while(end<n)
		{
			if(sum<s)
			{
				sum+=arr[end++];
			}
			if(sum>s)
			{
				sum-=arr[start-1];
				start+=1;
			}
			if(sum==s)
			{
				result.add(start);
				result.add(end);
				return result;
			}
		}
		return result;
    	}


	static public int findMaxMinSum(int[] A)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i: A)
		{
			min = i<min?i:min;
			max = i>max?i:max;
		}
		return min+max;
	}
}
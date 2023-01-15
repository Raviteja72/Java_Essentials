import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int arr[]={2,2,1,7,5,3};
		int k=4;
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<k;i++)
		{
		    hash.put(i,0);
		}
		int temp,ct=0,temp1;
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println(hash);
		    System.out.println(ct);
		    temp=arr[i]%k;
		    ct+=hash.get((k-temp)%k);
		    temp1=hash.get(temp)+1;
		    hash.put(temp,temp1);
		    
		}
		System.out.println(ct);
	}
}

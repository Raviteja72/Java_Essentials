import java.lang.Math;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[]=new int[]{1,3,5,2,10};
		int tot_sum=0;
		ArrayList<Integer> main_sum=new ArrayList();
		for(int i=0;i<arr.length-1;i++)
		{
		    tot_sum+= Math.pow((arr[i]-arr[i+1]),2);
		}
		
		ArrayList<Integer> array=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
		    array.add(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++)
		{
		    ArrayList<Integer> dummy=new ArrayList();
		    dummy = (ArrayList)array.clone();
		    for(int j=array.get(i)+1;j<array.get(i+1);j++)
		    {
		        dummy.add(i+1,j);
		        int dum_sum=0;
		        for(int k=1;k<dummy.size();k++)
		        {
		            dum_sum += Math.pow(dummy.get(k-1)-dummy.get(k),2);
		        }
		        main_sum.add(dum_sum);
		        dummy.remove(i+1);
		    }
		}
		int res = Collections.min(main_sum);
		System.out.println(res);
		
	}
}
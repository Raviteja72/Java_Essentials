import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int arr[]={7,2,1,-2,9};
		Vector<Integer> v = new Vector<Integer>();
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		    pQueue.add(arr[i]);
		    v.add(arr[i]);
		}
		Vector<Character> vt=new Vector<Character>();
		for(int i=0;i<arr.length;i++)
		{
		    vt.add('.');
		}
		Iterator iterator=pQueue.iterator();
		int ch=97;
        while (iterator.hasNext()) 
        {
            vt.set(v.indexOf(pQueue.remove()),(char)ch); 
            ch+=1;
        }
        System.out.println(v);
		System.out.println(vt);
	}
}
